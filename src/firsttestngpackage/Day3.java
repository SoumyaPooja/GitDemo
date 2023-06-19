package firsttestngpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Parameters({ "URL" })
	@Test
	public void webLoginHomeLoan(String uname)
	{
		System.out.println("webloginHome");
		System.out.println(uname);

	}
	@Test(groups= {"Smoke"})
	public void mobileLoginHomeLoan()
	{
		System.out.println("MobileloginHome");
	}
	@Test
	public void loginAPIHomeLoan()
	{
		System.out.println("APIloginHome");
		System.out.println("API");
		System.out.println("login");


	}
	@Test
	public void loginAPIHomeLoan2430()
	{
		System.out.println("APIloginHome");
		
	}

}
