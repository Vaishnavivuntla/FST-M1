package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Title of a page is: "+driver.getTitle());
		WebElement pressedKey = driver.findElement(By.id("keyPressed"));
		Action actionSeq1 = actions.sendKeys("V").build();
		actionSeq1.perform();
		System.out.println("Pressed key is: "+pressedKey.getText());
		Action actionSeq2 = actions
							.keyDown(Keys.CONTROL)
									.sendKeys("a")
									.sendKeys("c")
									.keyUp(Keys.CONTROL)
									.build();	
		actionSeq2.perform();
		System.out.println("Pressed Key is: "+pressedKey.getText());
		driver.close();
	}

}
