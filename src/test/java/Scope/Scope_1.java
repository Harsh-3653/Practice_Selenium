package Scope;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scope_1
{
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//no of links
	System.out.println(driver.findElements(By.tagName("a")).size());
	
	WebElement footer= driver.findElement(By.id("gf-BIGs"));
	System.out.println(footer.findElements(By.tagName("a")).size());
	
//	.findElements(By.tagName("a")).size());
	
	
	}

}
