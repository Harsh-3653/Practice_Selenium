//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class ExtendReports 
//{
//	
//	ExtentReports extent;
//	@BeforeTest
//	public void extendreports()
//	{
//		String path=System.getProperty("user.dir")+"\\reports\\index.html";
//		ExtentSparkReporter repoter =new ExtentSparkReporter(path);
//		repoter.config().setReportName("First report result");
//		
//	 extent =new  ExtentReports();
//		extent.attachReporter(repoter);
//		extent.setSystemInfo("teter", "Harsh Awasthi");
//	}
//	@Test
//	public void initialdemo()
//	{
//		extent.createTest("initial test");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver =new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com");
//		System.out.println(driver.getTitle()); 
//		extend.flush();
//		
//	}
//
//}
