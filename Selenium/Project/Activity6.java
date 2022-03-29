package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {

	WebDriver driver;
	
	

	@BeforeMethod
	public void beforeMethod()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
	@Test
	public void applyJob() throws InterruptedException
	{
		driver.findElement(By.linkText("Jobs")).click();
		Assert.assertEquals(driver.getTitle(), "Jobs – Alchemy Jobs", "Title Matched");
		driver.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys("Banking");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Thread.sleep(100);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='job_listings']/ul/li[1]")));
		driver.findElement(By.xpath("//div[@class='job_listings']/ul/li[1]")).click();
		driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
		String Email = driver.findElement(By.xpath("//a[@class='job_application_email']")).getText();
		System.out.println("To apply for job email to: "+Email);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
}
