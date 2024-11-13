package PropertiesReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesReader {
    Properties prop;

    public Properties readProperties() throws Exception {
        FileInputStream fis;
        prop = new Properties();

        String filePath = System.getProperty("user.dir")+ "\\src\\test\\java\\Properties\\ProjectProperties.properties";


        try {

            fis= new FileInputStream(new File(filePath));
            prop.load(fis);
        }catch(FileNotFoundException e){
            throw new Exception("File does not exist") ;

        }

        return prop;

    }
}
