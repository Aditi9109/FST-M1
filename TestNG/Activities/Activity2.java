package com.jobboard.mavenproject.FST_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
	
	@Test
	 public void executeTest1() {
		String title = driver.getTitle();
	    System.out.println("Page title is: " + title);
	    Assert.assertEquals("Target Practice", title);
		
    }
	
	@Test
	 public void executeTest2() {       
       WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
       Assert.assertTrue(blackButton.isDisplayed());
       Assert.assertEquals(blackButton.getText(), "Red");
   }
	
	@Test(enabled = false)
	 public void executeTest3() {      
       System.out.println("Skipped test");
   }
	
	@Test
	 public void executeTest4() {
		throw new SkipException("Skipping test case");
  }
	
	
	@AfterMethod
	public void quitBrowser() {
        driver.quit();
    }

}
