package com.jobboard.mavenproject.FST_TestNG;

import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity7 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	public void launchBrowser() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/login-form");
    }
	
	
	@DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] { { "admin", "password" }};
    }
    
    @Test (dataProvider = "Authentication")
    public void loginTestCase(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);        
        
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }
    @AfterTest(alwaysRun = true)
    public void afterMethod() {
        driver.close();
        driver.quit();
    }
	
}
