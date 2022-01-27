package TestQA.Selenium_FST;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://training-support.net/selenium/ajax");
		String pageTitle = driver.getTitle();
        System.out.println("Page Title: "+pageTitle);
        
        driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).click(); 
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
        String ajaxTxt = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(ajaxTxt);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        String lateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(lateText);
 
        driver.quit();
        
        
        
	}

}
