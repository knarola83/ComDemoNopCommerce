package Com.DemoNopCommerce;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp extends Utils {
   static Properties prop;
   static FileInputStream inputStream;

    public String getProperty(String key)
    {
        prop = new Properties();
        try {
            inputStream = new FileInputStream("src\\test\\Resources\\config.properties");
            prop.load(inputStream);
            inputStream.close();
        }catch (IOException e)
        {e.printStackTrace();}
       return prop.getProperty(key);
    }
}
