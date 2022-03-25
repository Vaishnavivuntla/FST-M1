package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.training-support.net/selenium/drag-drop");
		System.out.println("Title of a page is: "+driver.getTitle());
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
		WebElement ball = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement dropZone1 = driver.findElement(By.xpath("//*[@id='droppable']"));
		WebElement dropZone2 = driver.findElement(By.xpath("//*[@id='dropzone2']"));
		Actions actions =new Actions(driver);
		actions.clickAndHold(ball).moveToElement(dropZone1).click().build().perform();
		wait.until(ExpectedConditions.attributeToBeNotEmpty(dropZone1, "background-color"));
        System.out.println("ENTERED DROPZONE 1");
		actions.clickAndHold(ball).moveToElement(dropZone2).click().build().perform();
		 wait.until(ExpectedConditions.attributeToBeNotEmpty(dropZone2, "background-color"));
	     System.out.println("ENTERED DROPZONE 2");
		driver.close();
		

	}

}
