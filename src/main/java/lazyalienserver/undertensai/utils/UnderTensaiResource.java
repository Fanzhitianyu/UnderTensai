package lazyalienserver.undertensai.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class UnderTensaiResource {

    public static Map<String,String> UnderTensaiConfig =new HashMap<>();
    public static void loadLASResource(){
        LASLogUtils.log("loadUnderTensaiResource");
        createUnderTensaiConfig();
        getUnderTensaiConfig();
        UnderTensaiTranslations.UnderTensaiTranslationsResource = UnderTensaiTranslations.getUnderTensaiResource(UnderTensaiConfig.get("lang"));
    }

    public static void reloadUnderTensaiLang(){
        UnderTensaiTranslations.UnderTensaiTranslationsResource = UnderTensaiTranslations.getUnderTensaiResource(UnderTensaiConfig.get("lang"));
    }



    private static void getUnderTensaiConfig(){
        Stream<String> stringStream=FileUtils.readFile(FileUtils.getMainPath().resolve("UnderTensai.conf"));
        if (stringStream != null) {
            for (String s:stringStream.toList()){
                String[] strings=s.split(":");
                if (strings.length==2){
                    UnderTensaiConfig.put(strings[0],strings[1]);
                    LASLogUtils.log(strings[0]+":"+strings[1]);
                }
            }
        }
    }
    public static void createUnderTensaiConfig(){
        if (!FileUtils.getMainPath().resolve("UnderTensai.conf").toFile().exists()){
            FileUtils.writeFile(FileUtils.getMainPath().resolve("UnderTensai.conf"),FileUtils.getResourceFiles("assets/undertensai/UnderTensai.conf"));
        }
    }
}
