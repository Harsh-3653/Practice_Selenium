package java_Streams;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortTable 
{
	public static void main(String[] args) 
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on coloumn
		driver.findElement(By.xpath("//tr/th[1]"));
		
		//capture all text
		
		List<WebElement> li=driver.findElements(By.xpath("//tr/td[1]"));
		List<String> newlist=li.stream().map(s->s.getText()).collect(Collectors.toList());
		newlist.stream().sorted().forEach(s->System.out.println(s));
		
		
		//capture and print text
		//Sort in step 3
		
	}

}
