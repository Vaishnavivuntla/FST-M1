package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
	@Test
	public void headingTest()
	{
		String title = driver.getTitle();
		System.out.println("Title of a page is: "+title);
		WebElement header = driver.findElement(By.xpath("//h1[@class='entry-title']"));
		String Pageheader = header.getText();
		System.out.println("Header of a page is: "+Pageheader);
		Assert.assertEquals(Pageheader, "Welcome to Alchemy Jobs");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}

}
