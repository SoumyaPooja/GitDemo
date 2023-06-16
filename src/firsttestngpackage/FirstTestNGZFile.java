package firsttestngpackage;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FirstTestNGZFile {
	@AfterTest
	public void lastExecution()
	{
		System.out.println("I will execute last");
	}
  @Test
  public void demo() {
	  System.out.println("Hello");
		Assert.assertTrue(false);

  }
  @AfterSuite
  public void afSuite() {
	  System.out.println("I am the no 1 from last");
  }
  @Test
  public void SecondTest()
  {
	  System.out.println("Bye");
  }
}
