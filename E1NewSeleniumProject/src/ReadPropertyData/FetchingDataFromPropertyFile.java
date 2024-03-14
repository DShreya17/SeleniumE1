package ReadPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		
		//create the object of fileinputstream class
		FileInputStream fis = new FileInputStream("./Data/config.properties");
		
		
	    //create the object of properties class
		 Properties prop = new Properties();
		 
		 //load all keys 
		 prop.load(fis);
		 
		 //use get property methodk
		 String value = prop.getProperty("Browser");
		 
		 System.out.println(value);
		 
		 System.out.println(prop.getProperty("url"));

	}

}
