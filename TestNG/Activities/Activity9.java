package com.jobboard.mavenproject.FST_TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity9 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
        driver = new FirefoxDriver();
        Reporter.log("Step1: Start Test");
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("Step2: Launch Browser");
        Reporter.log("Step3: Page title is " + driver.getTitle());
    }
	
	@BeforeMethod
    public void beforeMethod() {
        Reporter.log("Step4: Test step execution stated");
        driver.switchTo().defaultContent();
    }
	
    
	@Test(priority = 0)
    public void simpleAlertTestCase() {
        Reporter.log("Step5: simpleAlertTestCase() started");
        driver.findElement(By.id("simple")).click();
        Reporter.log("Step6: Alert opened");
        Alert simpleAlert = driver.switchTo().alert();
        Reporter.log("Step7: Switched to alert");
        String alertText = simpleAlert.getText();
        Reporter.log("Step8: Alert text- " + alertText);
        Assert.assertEquals("This is a JavaScript Alert!", alertText);
 
        simpleAlert.accept();
        Reporter.log("Step9: Alert closed");
 
        Reporter.log("Step10: simpleAlertTestCase() ended");
    }
 
    @Test(priority = 1)
    public void confirmAlertTestCase() {
        Reporter.log("Step11: confirmAlertTestCase() started |");
        driver.findElement(By.id("confirm")).click();
        Reporter.log("Step12: Confirm Alert");
 
        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("Step13: Switched to alert |");
        String alertText = confirmAlert.getText();
        Reporter.log("Step14: Alert text - " + alertText);
        
        Assert.assertEquals("Step15: This is a JavaScript Confirmation!", alertText);
 
        confirmAlert.accept();
        Reporter.log("Step16: Alert closed");
 
        Reporter.log("Step17: confirmAlertTestCase() ended");
    }
 
    @Test(priority = 2)
    public void promptAlertTestCase() {
        Reporter.log("Step18: promptAlertTestCase() started");
        driver.findElement(By.id("prompt")).click();
        Reporter.log("Step19: Prompt Alert");
        Alert promptAlert = driver.switchTo().alert();
        Reporter.log("Step20: Switched to alert");
 
        String alertText = promptAlert.getText();
        Reporter.log("Step21: Alert text - " + alertText);
 
        promptAlert.sendKeys("Awesome!");
        Reporter.log("Step22: Text entered in prompt alert");
        
        Assert.assertEquals("Step23: This is a JavaScript Prompt!", alertText);
 
        promptAlert.accept();
        Reporter.log("Step24: Alert closed");
 
        Reporter.log("Step25: promptAlertTestCase() ended");
    }
    
    @AfterClass
    public void tearDown() {
        Reporter.log("Step26:Close browser");
        //Close the driver
        driver.close();
    }
	
}
