package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Static_dropdown {
	@Test
	public void Dropdown() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		/*
		 * // WebElement StaticDropdown //
		 * =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));//
		 * address // to dropdown
		* 
		 * 
		 * Select dropdown =new Select(StaticDropdown); //dropdown.selectByIndex(2);
		 * //dropdown.selectByValue("USD"); // dropdown
		 * System.out.println(dropdown.getFirstSelectedOption().getText());
		 * 
		 */
		WebElement dropdown = driver.findElement(By.id("divpaxinfo"));

		Select obj = new Select(dropdown);

		driver.close();

	}
}
