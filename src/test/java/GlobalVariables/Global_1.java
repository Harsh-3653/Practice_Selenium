package GlobalVariables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Global_1 
{
	public static void main(String[] args) throws IOException 
	{
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\harsh.awasthi\\eclipse-workspace\\Selenium_JAVA_1\\src\\test\\java\\data.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser", "Update Chrome");
		System.out.println(prop.getProperty("browser"));
	
		FileOutputStream fos=new FileOutputStream("C:\\Users\\harsh.awasthi\\eclipse-workspace\\Selenium_JAVA_1\\src\\test\\java\\data.properties");
		prop.store(fos, null);
	}
	

}
