package com.jobboard.mavenproject.FST_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
    }
	
	@Test
	 public void executeTest() {
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals("Training Support", title);
        driver.findElement(By.id("about-link")).click();
        System.out.println("New page title is: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }
	
	@AfterMethod
	public void quitBrowser() {
        driver.quit();
    }

}
