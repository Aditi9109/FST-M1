package com.jobboard.mavenproject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Activity4 {
	
	private WebDriver driver;
	private String url = "https://alchemy.hguy.co/jobs";
	
	@BeforeTest
	public void launchBrowser() {
		//launch browser
		driver = new FirefoxDriver();		
	}

	@Test
	public void verifyWebsiteHeaderTwo() {
	
		driver.get(url);
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Alchemy Jobs – Job Board Application");
		WebElement wbHeaderTwo = driver.findElement(By.xpath("//h2"));
		String headerText = wbHeaderTwo.getText();
		Assert.assertEquals(headerText, "Quia quis non");
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();		
	}
	
	
}
