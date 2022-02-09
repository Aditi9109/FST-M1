package com.jobboard.mavenproject.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity8 {

	private WebDriver driver;
	private String url = "https://alchemy.hguy.co/jobs/wp-admin";
	
	
	@BeforeTest
	public void launchBrowser() {
		//launch browser
		driver = new FirefoxDriver();		
	}

	@Test
	public void loginWebsite() {
		
		String user_name = "root";
		String pwd = "pa$$w0rd";
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));		
		driver.get(url);		
		//login
		WebElement wbUserId = driver.findElement(By.id("user_login"));
		WebElement wbPwd = driver.findElement(By.id("user_pass"));
		WebElement wbloginBtn = driver.findElement(By.id("wp-submit"));
		wbUserId.sendKeys(user_name);
		wbPwd.sendKeys(pwd);
		wbloginBtn.click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h1"), "Dashboard"));
		String LoggedInDisplayName = driver.findElement(By.xpath("//span[@class='display-name']")).getText();
		Assert.assertEquals(user_name, LoggedInDisplayName);
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();		
	}
}
