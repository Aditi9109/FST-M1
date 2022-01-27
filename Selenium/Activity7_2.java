package TestQA.Selenium_FST;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		
		driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("Aditi");
		driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("Password");
		driver.findElement(By.xpath("//div[label[text()='Confirm Password']]/input")).sendKeys("Password");
		driver.findElement(By.xpath("//div[label[text()='Email']]/input")).sendKeys("adi@email.com");
		driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
		String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
	    System.out.println("Login message: " + loginMessage);
        driver.quit();
        
        
        
	}

}
