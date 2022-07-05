//package First;
//
//import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
//import static org.testng.AssertJUnit.assertTrue;
//import static org.testng.AssertJUnit.assertTrue;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.util.Assert;
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
//		extent.setSystemInfo("tester", "Harsh Awasthi");
//	}
//	@Test
//	public void initialdemo()
//	{
//		ExtentTest test=extent.createTest("initial test");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver =new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com");
//		System.out.println(driver.getTitle());
//		
//		driver.close();
//		test.fail("Test fail");
//		test.addScreenCaptureFromBase64String(null);
//		extent.flush();
//		
//	}
//	
//	@Test
//	public void initialdemo1()
//	{
//		ExtentTest test=extent.createTest("initial test 1");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver =new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com");
//		System.out.println(driver.getTitle());
//		
//		driver.close();
//		test.fail("Test fail");
//		test.addScreenCaptureFromBase64String(null);
//		extent.flush();
//		
//	}
//	
//	
//	
//
//}
