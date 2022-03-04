package TestQA.Selenium_FST;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: "+pageTitle);  
        
        driver.findElement(By.xpath("//button[@id='prompt']")).click();
        
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert text is: " + alertText);
        alert.sendKeys("Awesome!");
        alert.accept();
        driver.quit();
       
	}
}
