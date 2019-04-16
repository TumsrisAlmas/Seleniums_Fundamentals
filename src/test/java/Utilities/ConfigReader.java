package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    public static String getProperties(String name) {
        String xx="";
        try {
            FileInputStream file = new FileInputStream("src/test/java/utilities/ConfigurationReader.properties");
            Properties config = new Properties();
            config.load(file);
            xx = config.getProperty(name);

        } catch (Exception e) { }
            return xx;
    }

    public static void main(String[] args) throws Exception {
        System.out.println( getProperties("FBWebsite") );
        System.out.println(  getProperties("GGWebSite") );


}
}
