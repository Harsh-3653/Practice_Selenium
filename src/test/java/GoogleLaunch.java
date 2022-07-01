
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLaunch
{
	@Test
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver(); 
		//driver.get("https://docs.microsoft.com/en-us/troubleshoot/developer/visualstudio/cpp/language-compilers/start-internet-browser");
		driver.get(null);

}
}