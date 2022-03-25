package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title of a page is: "+driver.getTitle());
		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert text is: "+alert.getText());
		alert.sendKeys("Yes, you are!");
		alert.accept();
		driver.close();

	}

}
