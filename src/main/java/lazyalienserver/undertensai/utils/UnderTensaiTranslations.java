package lazyalienserver.undertensai.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UnderTensaiTranslations {

    public static Map<String,String> UnderTensaiTranslationsResource =new HashMap<>();

    public static Map<String,String> getUnderTensaiResource(String lang){
        return getTranslationFromResourcePath("assets/undertensai/lang/%s.json",lang);
    }
    public static Map<String, String> getTranslationFromResourcePath(String path,String lang)
    {
        String dataJSON;
        try
        {
            dataJSON = IOUtils.toString(Objects.requireNonNull(UnderTensaiTranslations.class.getClassLoader().getResourceAsStream(String.format(path, lang))), StandardCharsets.UTF_8);
        }
        catch (IOException | NullPointerException e)
        {
            LASLogUtils.error("[UnderTensai]:"+"failed read lang_File   " + String.format(path,lang));
            return null;
        }

        Gson gson = (new GsonBuilder()).enableComplexMapKeySerialization().create();
        return gson.fromJson(dataJSON, (new TypeToken<Map<String, String>>()
        {
        }).getType());
    }
    public static String getUnderTensaiTranslations(String key) {
        return UnderTensaiTranslationsResource.get(key);
    }
}
