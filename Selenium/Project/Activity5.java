package com.jobboard.mavenproject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Activity5 {
	
	private WebDriver driver;
	private String url = "https://alchemy.hguy.co/jobs";
	
	@BeforeTest
	public void launchBrowser() {
		//launch browser
		driver = new FirefoxDriver();		
	}

	@Test
	public void clickJobMenu() {
	
		driver.get(url);
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Alchemy Jobs – Job Board Application");
		WebElement wbJobMenu = driver.findElement(By.xpath("//a[text()='Jobs']"));
		wbJobMenu.click();
		pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Jobs – Alchemy Jobs");
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();		
	}
	
	
}
