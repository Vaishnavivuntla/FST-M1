package suiteExample;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	
		// TODO Auto-generated method stub
		WebDriver driver;
		@BeforeClass
		public void beforeClass()
		{
			driver = new FirefoxDriver();
			driver.get("https://www.training-support.net/selenium/target-practice");
		}
		
		@Test
		public void oneTest()
		{
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		Assert.assertEquals("Target Practice", title);
		}
		@Test
		public void twoTest()
		{
			WebElement blackButton = driver.findElement(By.xpath("//button[contains(text(),'Black')]"));
			Assert.assertTrue(blackButton.isDisplayed());
			Assert.assertEquals(blackButton.getText(), "black");		
		}
		@Test(enabled = false)
		public void thirdTest()
		{
			String subHeading = driver.findElement(By.className("sub")).getText();
	        Assert.assertTrue(subHeading.contains("Practice"));
		}
		@Test
		public void fourthTest()
		{
			throw new SkipException("Skipping test case");
		}
		@AfterClass
		public void afterClass()
		{
			driver.close();
		}
	}

