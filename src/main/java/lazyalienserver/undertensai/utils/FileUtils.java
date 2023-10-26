package lazyalienserver.undertensai.utils;

import lazyalienserver.undertensai.UnderTensai;
import net.minecraft.util.WorldSavePath;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileUtils {
    public static Path getPath() {
        return UnderTensai.minecraftServer.getSavePath(WorldSavePath.ROOT);
    }
    public static Path getMainPath(){
        return FileUtils.getPath().resolve("UnderTensai");
    }
    public static boolean createDir(Path path){
        File file=new File(path.toUri());
        return file.mkdirs();
    }

    public static void writeFile(Path path, ArrayList<String> line){
        try {
            //new OutputStreamWriter(new FileOutputStream(new File(path.toUri())), StandardCharsets.UTF_8)
            BufferedWriter out= new BufferedWriter(new FileWriter(path.toFile(), StandardCharsets.UTF_8, true));
            for (String l:line) {
                out.write(l);
                out.newLine();
            }
            out.close();
        }
        catch (IOException ioException){
            LASLogUtils.error("[UnderTensai]:"+"failed write " + path.getFileName(), ioException);
        }

    }

    public static Stream<String> readFile(Path path){
        try {
            BufferedReader in=new BufferedReader(new FileReader(path.toFile(),StandardCharsets.UTF_8));
            //in.close();
            return in.lines();
        }
        catch (IOException ioException){
            LASLogUtils.error("[UnderTensai]:"+"failed read " + path.getFileName(), ioException);
        }
        return null;
    }


    public static ArrayList<String> getResourceFiles(String path) {
        try (InputStream inputStream=FileUtils.class.getClassLoader().getResourceAsStream(path)){
            List<String> fileList= IOUtils.readLines(inputStream,StandardCharsets.UTF_8);
            return new ArrayList<>(fileList);
        }
        catch (IOException ioException){
            LASLogUtils.error("[UnderTensai]: UnderTensaiResource -> getResourceFiles"+ioException);
        }
        return null;
    }
}
