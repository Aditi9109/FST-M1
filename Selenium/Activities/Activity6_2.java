package TestQA.Selenium_FST;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://training-support.net/selenium/dynamic-attributes");
        WebElement userName = driver.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'password')]"));
        userName.sendKeys("admin");
        password.sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Message after Login: " + loginMessage);
        
        driver.quit();
        
        
        
	}

}
