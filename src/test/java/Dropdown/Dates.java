package Dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dates 
{
	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//.ui-state-default.ui-state-highlight
	}

}
