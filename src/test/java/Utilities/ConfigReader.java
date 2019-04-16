package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
   static Properties config;

    static {
        try {
            FileInputStream file = new FileInputStream("src/test/java/utilities/ConfigurationReader.properties");
            config = new Properties();
            config.load(file);
        }catch(Exception e){}
    }

    public static String getProperties(String name) {
            return  config.getProperty(name);
    }

    public static void main(String[] args) throws Exception {
        System.out.println( ConfigReader.getProperties("FBWebsite") );
        System.out.println(  getProperties("GGWebSite") );


}
}
