package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox 
{
	public static void main(String[] args) 
	{
	
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//count no of check box
		System.out.println(  driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		/*
		 * List<WebElement>
		 * option=driver.findElements(By.cssSelector("input[type='checkbox']"));
		 * 
		 * for(WebElement list:option) {
		 * 
		 * System.out.println(list);
		 * 
		 * }
		 */
	
	}

}
