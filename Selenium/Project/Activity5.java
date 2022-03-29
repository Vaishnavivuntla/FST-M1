package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
	@Test
	public void Navigation()
	{
		driver.findElement(By.linkText("Jobs")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Jobs – Alchemy Jobs", "Title Matched");		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}


}
