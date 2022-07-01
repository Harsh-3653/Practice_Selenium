package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestive_Dropdown 
{
	public static void main(String[] args) throws InterruptedException
	{
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	   
	   driver.findElement(By.id("autosuggest")).sendKeys("ind");
	   Thread.sleep(2000);
	   
	   List<WebElement> options=driver.findElements(By.cssSelector("a[class='ui-corner-all']"));
	   
	   for( WebElement one:options)
	   {
		   if(one.getText().equalsIgnoreCase("India"))
				   {
			   			one.click();
				   }
	   }
	   
	   
	   
	}

}
