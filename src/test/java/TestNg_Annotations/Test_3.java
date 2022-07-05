package TestNg_Annotations;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test_3
{
	@Test(dataProvider = "getData")
	public void policy(String name,String age)
	{
		System.out.println("policy cover");
		System.out.println(name);
		System.out.println(age);
	}
	

	@Test(groups= {"smoke"})
	public void zerodepth()
	{
		System.out.println("zerodepth cover");
		
	}
	
	@BeforeSuite
	public void before_suit() {
		System.out.println("this is before suit");
	}

}
