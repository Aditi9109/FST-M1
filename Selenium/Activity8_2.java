package TestQA.Selenium_FST;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity8_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
        WebElement selectdropdownMessageText = driver.findElement(By.id("single-value"));
        Select selectdropdown = new Select(driver.findElement(By.id("single-select")));
 
        selectdropdown.selectByVisibleText("Option 2");
        System.out.println(selectdropdownMessageText.getText());
        selectdropdown.selectByIndex(3);
        System.out.println(selectdropdownMessageText.getText());
        selectdropdown.selectByValue("4");
        System.out.println(selectdropdownMessageText.getText());
        
        List<WebElement> options = selectdropdown.getOptions();
        for(WebElement option : options) {
            System.out.println("Option: " + option.getText());
        }
        driver.quit();
        
	}

}
