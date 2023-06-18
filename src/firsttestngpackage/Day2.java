package firsttestngpackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"Smoke"})
	public void demo()
	{
		System.out.println("good");
		System.out.println("better");
		System.out.println("best");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute First");
	}

}
