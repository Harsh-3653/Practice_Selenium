package CartProblem;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cart_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] arr = { "Cucumber", "Brocolli", "Beans" };

		List itemNeeded = Arrays.asList(arr);

		List<WebElement> list = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < list.size(); i++) {

			// Cucumber - 1 Kg

			String[] name = list.get(i).getText().split("-");

			String formattedName = name[0].trim();

			if (itemNeeded.contains(formattedName))

			{

				driver.findElements(By.xpath("(//button[text()='ADD TO CART'])")).get(i).click();
				//Thread.sleep(6000);

			}

			/*
			 * for(int j=0;j<arr.length;j++) { for(int i=0;i<list.size();i++) { String name
			 * =list.get(i).getText();
			 * 
			 * if(name.contains(arr[j])) {
			 * 
			 * driver.findElements(By.xpath("(//button[text()='ADD TO CART'])")).get(i).
			 * click();
			 * 
			 * break; }
			 * 
			 * }
			 */
		}

	}

}
