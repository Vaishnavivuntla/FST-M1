package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title = driver.getTitle();
		System.out.println("Title of a page is: "+title);
		WebElement displayedResult = driver.findElement(By.xpath("//input[@class='willDisappear']"));
		System.out.println("Result of isDisplayed method: "+displayedResult.isDisplayed());
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		driver.close();

	}

}
