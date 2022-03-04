package TestQA.Selenium_FST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		String pageTitle = driver.getTitle();
        System.out.println("Page Title: "+pageTitle);
        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
 
        driver.findElement(By.id("toggleCheckbox")).click(); 
        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
        
        driver.quit();
	}

}
