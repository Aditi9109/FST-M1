package TestQA.Selenium_FST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String pageTitle = driver.getTitle();
        System.out.println("Page Title: "+pageTitle);

        WebElement inputTextBox = driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println("Is textbox enabled?: " + inputTextBox.isEnabled());
        
        WebElement enableInputButton = driver.findElement(By.xpath("//button[text()='Enable Input']"));
        enableInputButton.click();
        System.out.println("Is textbox enabled?: " + inputTextBox.isEnabled());
        
        driver.quit();
	}

}
