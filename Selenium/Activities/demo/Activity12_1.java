package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/iframes");
		System.out.println("Title of a page is: "+driver.getTitle());
		WebElement frame1Heading = driver.findElement(By.cssSelector("body > div.activity.content > div > div > div"));
		System.out.println("Heading of the 1stFrame: "+frame1Heading.getText());
		
		WebElement button1  = driver.findElement(By.cssSelector("div.content"));
		System.out.println("Frame1 text: "+button1.getText());
		System.out.println("Frame1 css value: "+button1.getCssValue("background-color"));
		button1.click();
		
		System.out.println(button1.getText());
        System.out.println(button1.getCssValue("background-color"));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        
        WebElement frameHeading2 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(frameHeading2.getText());
 
        WebElement button2 = driver.findElement(By.cssSelector("button"));
        System.out.println(button2.getText());
        System.out.println(button2.getCssValue("background-color"));
        button2.click();
 
        System.out.println(button2.getText());
        System.out.println(button2.getCssValue("background-color"));
 
        driver.switchTo().defaultContent();
        driver.close();
	}
	
}
