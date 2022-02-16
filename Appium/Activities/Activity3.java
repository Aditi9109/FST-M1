package com.AppiumProject.mavenProject.Project;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity3 {
	
	// Declare Android driver
	WebDriverWait wait;
    AndroidDriver<MobileElement> driver;
    
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "appiumClass");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.calculator");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
        caps.setCapability("noReset", true);
 
        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
    }
    
    @Test
    public void add() {
    	
    	driver.findElementById("digit_5").click();
        driver.findElementById("op_add").click();
        driver.findElementById("digit_9").click();
        // Perform Calculation
        driver.findElementById("eq").click();
        
        String result = driver.findElementById("result_final").getText();
        System.out.println(result);
        Assert.assertEquals(result, "14");
        
    }
    
    @Test
    public void subtract() {
    	
    	driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("op_sub").click();
        driver.findElementById("digit_5").click();
        // Perform Calculation
        driver.findElementById("eq").click();
 
        // Display Result
        String result = driver.findElementById("result_final").getText();
        System.out.println(result);
        Assert.assertEquals(result, "5");
        
    }
 
    @Test
    public void multiply() {
        driver.findElementById("digit_5").click();
        driver.findElementById("op_mul").click();
        driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("digit_0").click();
        // Perform Calculation
        driver.findElementById("eq").click();
 
        // Display Result
        String result = driver.findElementById("result_final").getText();
        System.out.println(result);
        Assert.assertEquals(result, "500");
    }
 
    @Test
    public void divide() {
        driver.findElementById("digit_5").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("op_div").click();
        driver.findElementById("digit_2").click();
        // Perform Calculation
        driver.findElementById("eq").click();
 
        // Display Result
        String result = driver.findElementById("result_final").getText();
        System.out.println(result);
        Assert.assertEquals(result, "25");
    }
    @AfterClass
    public void tearDown() {
        // Close app
        driver.quit();
    }    

}
