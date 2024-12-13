package properties_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//to specify the common data which is required for all TCs

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {

		//location of properties file
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
        
		//load the properties file using properties class.
		Properties prop= new Properties();
		prop.load(file);
		
		//read data from properties file
		String appurl=prop.getProperty("appurl");
		String email=prop.getProperty("email");
		String pwd=prop.getProperty("password");
		String ordId=prop.getProperty("orderid");
		String custId=prop.getProperty("customerid");

		System.out.println(appurl+" "+email+" "+pwd+" "+ordId+" "+custId);
	}

}
