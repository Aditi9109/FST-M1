package com.jobboard.mavenproject.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {

	private WebDriver driver;
	private String url = "https://alchemy.hguy.co/jobs/wp-admin";
	
	
	@BeforeTest
	public void launchBrowser() {
		//launch browser
		driver = new FirefoxDriver();		
	}

	@Test
	public void addNewJob() {
		
		String user_name = "root";
		String pwd = "pa$$w0rd";
		String positionName = "TestPosition";
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));		
		driver.get(url);		
		//login
		WebElement wbUserId = driver.findElement(By.id("user_login"));
		WebElement wbPwd = driver.findElement(By.id("user_pass"));
		WebElement wbloginBtn = driver.findElement(By.id("wp-submit"));
		wbUserId.sendKeys(user_name);
		wbPwd.sendKeys(pwd);
		wbloginBtn.click();
		//verify logged in
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h1"), "Dashboard"));
		String LoggedInDisplayName = driver.findElement(By.xpath("//span[@class='display-name']")).getText();
		Assert.assertEquals(user_name, LoggedInDisplayName);
		//Add new job
		WebElement wbNew = driver.findElement(By.xpath("//span[@class='ab-label' and text()='New']"));
		Actions act = new Actions(driver);
		act.moveToElement(wbNew).perform();
		WebElement wbAddJob = driver.findElement(By.xpath("//a[@class='ab-item' and text()='Job']"));
		wbAddJob.click();
		
		//Enter details
		driver.findElement(By.xpath("//textarea[@id='post-title-0']")).sendKeys(positionName);
		driver.findElement(By.xpath("//input[@name='_job_location']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='_company_name']")).sendKeys("IBM");
		driver.findElement(By.xpath("//input[@name='_company_website']")).sendKeys("https://www.ibm.com/");
		driver.findElement(By.xpath("//input[@name='_company_tagline']")).sendKeys("i am tagline");
		driver.findElement(By.xpath("//input[@name='_company_twitter']")).sendKeys("@ibmIndia");
		
		//publish and verify
		driver.findElement(By.xpath("//button[text()='Publish…']")).click();
		driver.findElement(By.xpath("//button[text()='Publish']")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[contains(@class,'post-publish-panel__postpublish-header')]"), "is now live."));
		boolean islive = driver.findElement(By.xpath("//a[text()='"+positionName+"']")).isDisplayed();
		Assert.assertTrue(islive);
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();		
	}
}
