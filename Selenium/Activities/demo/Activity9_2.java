package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");
		System.out.println("Title of a page is: "+driver.getTitle());
		WebElement chosen = driver.findElement(By.xpath("//h3[@id='multi-value']"));
		Select multilist = new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));
		if(multilist.isMultiple()) {
			multilist.selectByVisibleText("Javascript");
			System.out.println("Chosen text is: "+chosen.getText());
			
			multilist.selectByValue("node");
			System.out.println("Chosen text with value is: "+chosen.getText());
			
			for(int i=4;i<=6;i++) {
				
				multilist.selectByIndex(i);				
			}
			System.out.println("chosen text by index is: "+chosen.getText());
			multilist.deselectByValue("node");
			System.out.println("After deselecting nodeJS"+chosen.getText());
			
			multilist.deselectByIndex(7);
			System.out.println("After deselecting 7th index: "+chosen.getText());
			
			List<WebElement> selectedOptions = multilist.getAllSelectedOptions();
			
			for (WebElement selectOption : selectedOptions) {
				
				System.out.println("Selected option: "+selectOption.getText());
			}
			
			multilist.deselectAll();
			System.out.println("After deselecting: "+chosen.getText());
			
		}
		
		driver.close();
	}

}
