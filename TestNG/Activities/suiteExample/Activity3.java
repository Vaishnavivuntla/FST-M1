package suiteExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	@BeforeClass
	public void beforeClass()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}
	
	@Test
	public void testOne()
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		WebElement confirmation = driver.findElement(By.id("action-confirmation"));
		Assert.assertEquals("Welcome Back, admin", confirmation.getText());
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}
}
