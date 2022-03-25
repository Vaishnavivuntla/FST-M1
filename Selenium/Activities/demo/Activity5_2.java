package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title = driver.getTitle();
		System.out.println("Title of a page is: "+title);
		WebElement checkboxInput = driver.findElement(By.xpath("//input[@class='willDisappear']"));
		System.out.println("Checking whether checkbox selected: "+checkboxInput.isSelected());
		checkboxInput.click();
		System.out.println("checking checkbox is selected again: "+checkboxInput.isSelected());
		driver.close();
	}
}	
