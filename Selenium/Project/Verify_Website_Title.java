package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Verify_Website_Title {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
	@Test
	public void titleTest()
	{
		
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		Assert.assertEquals("Alchemy Jobs – Job Board Application", title);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}

}
