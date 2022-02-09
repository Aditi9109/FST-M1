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
public class Activity6 {
	
	private WebDriver driver;
	private String url = "https://alchemy.hguy.co/jobs";
	
	
	@BeforeTest
	public void launchBrowser() {
		//launch browser
		driver = new FirefoxDriver();		
	}

	@Test
	public void applyJob() {
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get(url);
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Alchemy Jobs – Job Board Application");
		WebElement wbJobMenu = driver.findElement(By.xpath("//a[text()='Jobs']"));
		wbJobMenu.click();
		pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Jobs – Alchemy Jobs");
		//Enter keyword in searchbox
		WebElement wbSearchKeyword = driver.findElement(By.id("search_keywords"));
		wbSearchKeyword.sendKeys("Banking");
		//click search job button
		WebElement wbSearchJobBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Search Jobs']"));
		wbSearchJobBtn.click();
		//click first Job
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//ul[@class='job_listings']/li[1]/a//h3"), "Banking"));
		WebElement wbFirstJob = driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]/a"));
		wbFirstJob.click();
		//click Apply for job
		WebElement wbApplyForJob = driver.findElement(By.xpath("//input[@type='button' and @value='Apply for job']"));
		wbApplyForJob.click();
		//Print the email/link from UI
		WebElement wblink = driver.findElement(By.xpath("//div[@class='application_details']/p/a"));
		String link = wblink.getText();
		System.out.println("Link displayed: "+link);
		
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();		
	}
	
	
}
