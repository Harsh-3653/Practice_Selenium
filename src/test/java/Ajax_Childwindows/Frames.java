package Ajax_Childwindows;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames 
{
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
	driver.findElement(By.id("draggable")).click();
	
	//drag and drop
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	Actions a=new Actions(driver);
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement dest=driver.findElement(By.id("droppable"));
	a.dragAndDrop(source, dest).build().perform();
	
	}
}
