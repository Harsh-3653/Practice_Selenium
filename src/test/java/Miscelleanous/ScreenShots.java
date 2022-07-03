package Miscelleanous;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShots
{
	public static void main(String[] args) throws IOException 
	{
	

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver(); 
		driver.get("http://google.com");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D://screenshots.png"));
	}

}
