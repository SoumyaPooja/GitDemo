package firsttestngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before executing all the methods in the class");
	}
	
	@Parameters({ "URL","APIKey/Username" })
	@Test
	public void webLoginCarLoan(String urlname, String key)
	{
		System.out.println("webloginCar");
		System.out.println(urlname);
		System.out.println(key);

	}
	@Test(dataProvider="getData")
	public void mobileLoginCarLoan(String username, String password)
	{
		System.out.println("MobileloginCar");
		System.out.println(username);
		System.out.println(password);

		
	}
	@BeforeSuite
	public void bfSuit()
	{
		System.out.println("I am no 1");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After executing all the methods in the class");
	}
	@Test(enabled=false)
	public void mobileSignInCarLoan()
	{
		System.out.println("Mobile SignIn");
	}
	@BeforeMethod
	public void beforeEvery()
	{
		System.out.println("I will execute before every test method in Day4 class");

	}
	@AfterMethod
	public void afterEvery()
	{
		System.out.println("I will execute after every test method in Day4 class");

	}
	@Test(groups= {"Smoke"})
	public void mobileSignOutCarLoan()
	{
		System.out.println("Mobile SignOut");
	}
	@Test(dependsOnMethods= {"webLoginCarLoan","mobileSignOutCarLoan"})
	public void APICarLoan()
	{
		System.out.println("APIloginCar");
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st
		//2nd
		//3rd
		Object[][] data=new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		
		//2nd
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		//3rd
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
	}

}
