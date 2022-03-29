package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void beforeMethod()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void createJobList()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("root");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		String verifyTitle = driver.getTitle();
		Assert.assertEquals(verifyTitle, "Dashboard ‹ Alchemy Jobs — WordPress");
		driver.findElement(By.xpath("//div[contains(text(),'Job Listings')]")).click();
		//WebElement addNew = driver.findElement(By.cssSelector("a[href*='job_listing']"));
		 //addNew.click();
		driver.findElement(By.linkText("Add New")).click();
		WebElement positionName = driver.findElement(By.xpath("//*[@id=\"post-title-0\"]"));
		positionName.sendKeys("SeleniumNewJobTest");
		String job = positionName.getText();
		driver.findElement(By.cssSelector("#_job_location")).sendKeys("India");
		driver.findElement(By.cssSelector("#_company_name")).sendKeys("IBM");
		driver.findElement(By.cssSelector("#_company_website")).sendKeys("india@ibm.in");
		driver.findElement(By.cssSelector("#_company_tagline")).sendKeys("Business Machine");
		driver.findElement(By.cssSelector("#_company_twitter")).sendKeys("twitter");
		driver.findElement(By.xpath("//input[@id='_job_expires']")).sendKeys("20/12/2022");
		driver.findElement(By.xpath("//button[@class='components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary']")).click();
		System.out.println("Published Job");
		driver.navigate().back();
		List<WebElement> joblist = driver.findElements(By.xpath("//div[@class='position']/a"));
		for(WebElement joblistd:joblist)
		{
			if(joblistd.getText().contains(job))
			{
				System.out.println("Job "+job+" is listed");
			}
		}
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}

}
