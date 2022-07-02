package Ajax_Childwindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_example 
{

	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	//driver.close();
	driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
	Set<String> windows=driver.getWindowHandles();
	
	Iterator<String> it=windows.iterator();//[parent ,child]
	String nameid=it.next();//moves to parent
	String child=it.next();//moves to child
	
	driver.switchTo().window(child);
	
	String idValue=driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText();
	
	driver.switchTo().window(nameid);
	
	driver.findElement(By.id("username")).sendKeys(idValue);
	
	driver.findElement(By.id("password")).sendKeys(" learning");
	driver.findElement(By.id("terms")).click();
	driver.findElement(By.id("signInBtn")).click();
	
	
	
	
	
	
	}
}
