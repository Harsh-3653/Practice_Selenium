import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	

	@Test
	public void loc()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://sso.teachable.com/secure/9521/identity/login/password?wizard_id=l2w0xvspuJVso-iFgxX--XRT0g4E1ZbMcqyETQqMFghG_C0Z1fs3atDPrh5SBAzFEmUK4kyu46zXrya_ykNqKg");
	
	driver.findElement(By.id("email")).sendKeys("harah.awasthi@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Hash");
	//driver.findElement(By.cssSelector(input[nazme="commit"])).click();
	//driver.findElement(By.name("commit")).click();
	Assert.assertEquals(true, true);
	}
}