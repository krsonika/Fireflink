package generic_Lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;

public class ReadData {
	/**
			 * this method is used to read the data from the property file
			 * @param key    you have to pass key data to read the value
			 * @return it will return the value based on the key passed.
			 */
			public static String fromProperty(String key) {
				FileInputStream fis=null;
				Properties properties=new Properties();;
				try {
					fis=new FileInputStream(new File("./src/test/resources/testData/configuration.properties"));
					properties.load(fis);
				}
				catch(FileNotFoundException e) {
					e.printStackTrace();
				}
				catch(EncryptedDocumentException e) {
					e.printStackTrace();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				return properties.getProperty(key).toString();
			}
}

