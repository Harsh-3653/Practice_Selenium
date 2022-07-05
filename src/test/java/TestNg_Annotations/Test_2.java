package TestNg_Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_2 {

	@Test(groups= {"smoke"})

	public void CarLoan() {
		System.out.println("Car loan");
	}

	@Test(groups= {"smoke"})
	public void PersonalLoan() {
		System.out.println("PersonalLoan");
	}
		@AfterSuite
	public void after_suit() {
		System.out.println("this is after suit");
	}
		
		@DataProvider
		public Object[][] getdata	()
		{
			Object[][] data=new Object[3][2];
			
			//set 1
			data[0][0]="harsh";
			data[0][1]="21";
			
			//set 2
			data[1][0]="Rajat";
			data[1][1]="22";
			
			
			data[2][0]="Ritesh";
			data[2][1]="21";
			
			return data;
		}
}
