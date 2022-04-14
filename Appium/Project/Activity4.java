package activities;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Activity4 {
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	
	@BeforeClass
	  public void beforeClass() throws MalformedURLException{
		  DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability("deviceName", "Pixel 4 API 28");
		    desiredCapabilities.setCapability("platformName", "Android");
		    desiredCapabilities.setCapability("automationName", "UiAutomator2");
		    desiredCapabilities.setCapability("appPackage", "com.android.chrome");
		    desiredCapabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		    desiredCapabilities.setCapability("noReset", true);

		    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

		    driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
		    wait = new WebDriverWait(driver,10);	  
	  }
	
  @Test
  public void addTask() {
	
	  
	 //launching url 
	  driver.get("https://www.training-support.net/selenium");
	 
	 //scrolling to To DO List 
		driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingToEnd(5)"));
		driver.findElementByXPath("//android.view.View[contains(@text,'To-Do List')]").click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      String[] tasks = { "Add tasks to list", "Get number of tasks", "Clear the list" };
		for (String task : tasks) {
			driver.findElementByXPath("//android.widget.EditText[@resource-id = 'taskInput']").click();
			driver.findElementByXPath("//android.widget.EditText[@resource-id = 'taskInput']").sendKeys(task);
			driver.findElementByXPath("//android.widget.Button[@text = 'Add Task']").click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		driver.findElementByXPath("//android.view.View[@text='Add tasks to list']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.view.View[@text='Get number of tasks']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.view.View[@text='Clear the list']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.view.View[3][@class='android.view.View']").click();
		System.out.println("task list is cleared ");
		}
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}