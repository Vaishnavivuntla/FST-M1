package activities;

	import static org.testng.Assert.assertEquals;

	import java.net.MalformedURLException;
	import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

	public class Activity1 {
		   WebDriverWait wait;
		    AppiumDriver<MobileElement> driver = null;
		 
		    @BeforeTest
		    public void setup() throws MalformedURLException {
		 
		        // Set the Desired Capabilities
		        DesiredCapabilities caps = new DesiredCapabilities();
		        caps.setCapability("deviceName", "Pixel 4 API 28");
		        caps.setCapability("platformName", "Android");
		        caps.setCapability("appPackage", "com.google.android.apps.tasks");
		        caps.setCapability("appActivity", ".ui.TaskListsActivity");
		        caps.setCapability("noReset", true);
		 
		        // Instantiate Appium Driver
		        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		        wait = new WebDriverWait(driver, 10);
		    }
		 
		    @Test
		    public void createListOfActivities() {
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   	 
		        System.out.println("Google task is open");
		       
		     driver.findElementById("tasks_fab").click();
		     System.out.println("task opened");
		     MobileElement task1 = driver.findElementById("add_task_title");
		     task1.sendKeys("Complete Activity with Google Tasks");
		     String task1text = task1.getText();
		     Assert.assertEquals(task1text, "Complete Activity with Google Tasks");
		     driver.findElementById("add_task_done").click();
		     driver.findElementById("tasks_fab").click();
		     
		      MobileElement task2 = driver.findElementById("add_task_title");
		      task2.sendKeys("Complete Activity with Google Keep");
		      String task2text = task2.getText();
		      Assert.assertEquals(task2text, "Complete Activity with Google Keep");
		      driver.findElementById("add_task_done").click();
		 		     
		       
		   
		       driver.findElementById("tasks_fab").click();
		       MobileElement task3 = driver.findElementById("add_task_title");
		       task3.sendKeys("Complete the second Activity Google Keep");
		       String task3text = task3.getText();
			   Assert.assertEquals(task2text, "Complete the second Activity Google Keep");
			   driver.findElementById("add_task_done").click();
		      
		    }
		    @AfterTest
		    public void tearDown() {
		        //driver.quit();
		    }
}
