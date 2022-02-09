package com.jobboard.mavenproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Activity1 {
	
	private WebDriver driver;
	private String url = "https://alchemy.hguy.co/jobs";
	
	@BeforeTest
	public void launchBrowser() {
		//launch browser
		driver = new FirefoxDriver();		
	}

	@Test
	public void openWebsite() {
	
		driver.get(url);
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Alchemy Jobs – Job Board Application");
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();		
	}
	
	
}
