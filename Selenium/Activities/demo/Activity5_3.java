package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title of the page is: "+driver.getTitle());
		WebElement checkTextField = driver.findElement(By.xpath("//input[@id='input-text']"));
		System.out.println("Is the text field is enabled: "+checkTextField.isEnabled());
		driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
		System.out.println("Is the text field is enabled: " +checkTextField.isEnabled());
        driver.close();

	}

}
