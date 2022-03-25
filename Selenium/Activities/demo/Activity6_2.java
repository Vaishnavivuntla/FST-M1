package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://training-support.net/selenium/ajax");
		String title = driver.getTitle();
		System.out.println("Title of a page is: "+title);
		driver.findElement(By.xpath("//button[contains(@class,'ui violet button')]")).click();		
        String ajaxText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println("ajaxtextis: "+ajaxText);    
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        String lateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println("late Text is: "+lateText);
        driver.close();
	}

}
