package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		System.out.println("Title of a page is: "+driver.getTitle());
		driver.findElement(By.xpath("//input[starts-with(@class,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[starts-with(@class,'password')]")).sendKeys("password");
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Log in')]"));
		wait.until(ExpectedConditions.visibilityOf(loginButton)).click();
		WebElement loginConfirm = driver.findElement(By.id("action-confirmation"));
		System.out.println("Login message is : " +loginConfirm.getText());
		driver.close();
	}

}
