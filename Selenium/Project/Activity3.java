package com.jobboard.mavenproject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Activity3 {
	
	private WebDriver driver;
	private String url = "https://alchemy.hguy.co/jobs";
	
	@BeforeTest
	public void launchBrowser() {
		//launch browser
		driver = new FirefoxDriver();		
	}

	@Test
	public void displayImageUrl() {
	
		driver.get(url);
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Alchemy Jobs – Job Board Application");
		WebElement wbHeaderImg = driver.findElement(By.xpath("//header[contains(@class,'entry-header')]//img"));
		String headerImgUrl = wbHeaderImg.getAttribute("src");
		System.out.println("Image URL : "+headerImgUrl);
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();		
	}
	
	
}
