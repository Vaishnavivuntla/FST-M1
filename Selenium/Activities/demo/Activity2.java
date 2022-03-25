package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println("Title of the page: " +driver.getTitle());
		
		WebElement idLocator = driver.findElement(By.id("about-link"));
		System.out.println("Text in element: " +idLocator.getText());
		
		WebElement classlocator = driver.findElement(By.className("green"));
		System.out.println("Text in class locator element: " +classlocator.getText());
		
        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in css locator element: " + cssLocator.getText());

        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in linkTextLocator element: " + linkTextLocator.getText());
        linkTextLocator.click();
		
		driver.close();

	}

}
