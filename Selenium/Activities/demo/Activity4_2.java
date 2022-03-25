package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vaishnavi");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Vaishu");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vvaishu22@gmail.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("1234567899");
		driver.findElement(By.xpath("//textarea")).sendKeys("Test message");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
	}

}
