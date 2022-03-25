package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		System.out.println("Title of a page is: "+driver.getTitle());
		
        WebElement userName = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
        WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
        userName.sendKeys("Vaishnavi");
        password.sendKeys("password");
        confirmPassword.sendKeys("password");
        email.sendKeys("xyz@gmail.com");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        WebElement loginMessage = driver.findElement(By.id("action-confirmation"));
        String waitMessage = wait.until(ExpectedConditions.visibilityOf(loginMessage)).getText();
        System.out.println("Login message: "+waitMessage);
        driver.close();
        
	}

}
