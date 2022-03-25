package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.training-support.net/selenium/tab-opener");
		System.out.println("Title of a page is: "+driver.getTitle());
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window: "+parentWindow);
		driver.findElement(By.id("launcher")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("All Window Handles: "+allWindowHandles);
		
		for(String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
		}
		System.out.println("Current Window handle: "+driver.getWindowHandle());
		String newTabText = driver.findElement(By.xpath("//div[@class='content']")).getText();
        System.out.println("New tab heading is: " + newTabText);
 
        driver.findElement(By.linkText("Open Another One!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
 
        allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindowHandles);
 
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        System.out.println("New tab handle: " + driver.getWindowHandle());
 
        wait.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println("New Tab Title is: " + driver.getTitle());
 
        //Get heading on new page
        newTabText = driver.findElement(By.xpath("//div[@class='content']")).getText();
        System.out.println("New tab heading is: " + newTabText);
 
        //Close the browser
        driver.quit();
		}

}
