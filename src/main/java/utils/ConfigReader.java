package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    Properties props;

    public ConfigReader (String path){
        props=new Properties();
        try (FileInputStream fis = new FileInputStream(path)) {
            props.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    public String get(String key) {
        return props.getProperty(key);
    }
}

