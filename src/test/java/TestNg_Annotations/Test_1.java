package TestNg_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.junit.runners.Parameterized.Parameters;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_1

{
    @org.testng.annotations.Parameters({"Url","Key"})
	@BeforeMethod
	public void beforemethod(String name,String key )
	{
    	System.out.println(name);
    	System.out.println(key);
    	System.out.println("Before method");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("this is after method");
	}
	@AfterClass
	public void afterblock()
	{
		System.out.println("Last execution");
	}
	
	
	
	@Test(groups= {"smoke"})
	public void PLoan()
	{
		System.out.println("prersonal loan");
	}
	
	
	@Test
	public void insurance()
	{
		System.out.println("insurance");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test method");
	}

}
