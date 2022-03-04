package TestQA.Selenium_FST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: "+pageTitle);
        
        WebElement F_Name = driver.findElement(By.xpath("//input[@id ='firstName']"));
        WebElement L_Name = driver.findElement(By.xpath("//input[@id ='lastName']"));
 
        F_Name.sendKeys("Aditi");
        L_Name.sendKeys("Singh");
        driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("adi@example.com");
        driver.findElement(By.xpath("//input[@id ='number']")).sendKeys("9999999999");
        driver.findElement(By.xpath("//textarea")).sendKeys("Hello");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.quit();

	}

}
