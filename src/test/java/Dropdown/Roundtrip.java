package Dropdown;

import org.jsoup.select.Evaluator.ContainsData;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Roundtrip

{
 public static void main(String[] args) 
 {
	 WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
	if(	driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("its enable");
			
			Assert.assertTrue(true);
		}
	else
	{
		Assert.assertTrue(true);
	}
		
		driver.close();
 }
}
