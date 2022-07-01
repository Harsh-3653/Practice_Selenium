package Ajax_Childwindows;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajax_demo {

	public static void main(String[] args) throws InterruptedException {

		
		  WebDriverManager.chromedriver().setup(); WebDriver driver =new
		  ChromeDriver(); driver.get("https://www.testingxperts.com/");
		 // Thread.sleep(5000);
		  Actions a=new Actions(driver);
		  driver.switchTo().alert().dismiss();
		  
		  a.moveToElement(driver.findElement(By.id("menu-item-3148"))).build().perform(
		  );
		  
		 
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver =new
		 * ChromeDriver(); //driver.manage().window().maximize();
		 * driver.get("https://www.olx.in/"); Actions text=new Actions(driver);
		 * WebElement target=driver.findElement(By.xpath("//input[@type='text']")); //To
		 * type text in captial letters
		 * //text.moveToElement(target).click().keyDown(Keys.SHIFT).
		 * sendKeys("mobile phone").build().perform();
		 * text.moveToElement(target).click().keyDown(Keys.SHIFT).
		 * sendKeys("mobile phone").doubleClick().build().perform();
		 * 
		 * //text.moveToElement(target)
		 */
	}
}
