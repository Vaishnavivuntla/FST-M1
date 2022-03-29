package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	}
	@Test
	public void backendLogin()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("root");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		String verifyTitle = driver.getTitle();
		Assert.assertEquals(verifyTitle, "Dashboard ‹ Alchemy Jobs — WordPress");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}

}
