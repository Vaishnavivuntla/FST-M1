package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
	@Test
	public void secondHeading()
	{
		String pageSecondHeading = driver.findElement(By.xpath("//div[@class='entry-content clear']//h2")).getText();
		System.out.println("Second Heading of Website is: "+pageSecondHeading);
		Assert.assertEquals(pageSecondHeading, "Quia quis non");
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}

}

