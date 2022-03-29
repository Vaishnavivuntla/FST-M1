package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void beforeMethod()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
	@Test
	public void createJob() throws InterruptedException
	{
		driver.findElement(By.linkText("Post a Job")).click();
		Assert.assertEquals(driver.getTitle(), "Post a Job – Alchemy Jobs", "Title Matched");
		System.out.println("In Post a Job page");
		System.out.println("Started filling details");
		driver.findElement(By.xpath("//input[@id='create_account_email']")).sendKeys("testvud@mailinator.com");
		driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys("Test New Job Listing");
		
		Select jobType = new Select(driver.findElement(By.id("job_type")));
		jobType.selectByValue("2");
		driver.switchTo().frame(driver.findElement(By.id("job_description_ifr")));
		WebElement editable = driver.switchTo().activeElement();
		editable.sendKeys("Test Description");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='application']")).sendKeys("testvud@mailinator.com");
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("IBM");
		driver.findElement(By.xpath("//input[@id='company_website']")).sendKeys("https://www.ibm.com/");
		driver.findElement(By.xpath("//input[@value='Preview']")).click();
		driver.findElement(By.xpath("//input[@id='job_preview_submit_button']")).click();
		System.out.println("Submitting new job list");
		driver.findElement(By.linkText("Jobs")).click();
		WebElement searchKey =driver.findElement(By.xpath("//input[@id='search_keywords']"));
		searchKey.sendKeys("Test New Job Listing");
		String jobname = searchKey.getText();
		driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
		List<WebElement> joblisting = driver.findElements(By.xpath("//div[@class='position']"));
		for(WebElement joblisted:joblisting)
		{
			if(joblisted.getText().contains(jobname))
			{
				System.out.println("Job "+jobname+" is listed");
			}
		}
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}

}
