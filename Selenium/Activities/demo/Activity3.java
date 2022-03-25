package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println("Title of Page: "+driver.getTitle());
		WebElement firstname =driver.findElement(By.id("firstName"));
		firstname.sendKeys("Vaishnavi");
		WebElement lastname =driver.findElement(By.id("lastName"));
		lastname.sendKeys("Vaishu");
		WebElement email =driver.findElement(By.id("email"));
		email.sendKeys("vvaishu22@gmail.com");
		WebElement number =driver.findElement(By.id("number"));
		number.sendKeys("1234567891");
		driver.findElement(By.cssSelector(".ui.green.button")).click();				
		driver.close();
	}
}
