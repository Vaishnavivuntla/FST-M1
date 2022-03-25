package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Acitivity9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");
		System.out.println("Title of a page is: "+driver.getTitle());
		WebElement chosentext = driver.findElement(By.xpath("//h3[@id='single-value']"));
		Select dropdown =new Select(driver.findElement(By.xpath("//select[@id='single-select']")));
		dropdown.selectByVisibleText("Option 2");
		System.out.println(chosentext.getText());
		
		dropdown.selectByIndex(3);
		System.out.println(chosentext.getText());
		
		dropdown.selectByValue("4");
		System.out.println(chosentext.getText());
		 
		// Get all the options inside the select as a list
		List<WebElement> options = dropdown.getOptions();
		
		for(WebElement option : options)
		{
			System.out.println("Option: "+option.getText());
		}
		driver.close();
		

	}

}
