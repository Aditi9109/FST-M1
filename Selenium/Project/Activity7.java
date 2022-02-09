package com.jobboard.mavenproject.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Activity7 {
	
	private WebDriver driver;
	private String url = "https://alchemy.hguy.co/jobs";
	
	
	@BeforeTest
	public void launchBrowser() {
		//launch browser
		driver = new FirefoxDriver();		
	}

	@Test
	public void createJob() {
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		String Job_name = "BankingTestJob";
		driver.get(url);
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Alchemy Jobs – Job Board Application");
		WebElement wbJobMenu = driver.findElement(By.xpath("//a[text()='Post a Job']"));
		wbJobMenu.click();
		//sign in button click
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		//login
		WebElement wbUserId = driver.findElement(By.id("user_login"));
		WebElement wbPwd = driver.findElement(By.id("user_pass"));
		WebElement wbloginBtn = driver.findElement(By.id("wp-submit"));
		wbUserId.sendKeys("root");
		wbPwd.sendKeys("pa$$w0rd");
		wbloginBtn.click();
		//verify page titles
		pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Post a Job – Alchemy Jobs");
		//Enter Job Details
		driver.findElement(By.id("job_title")).sendKeys(Job_name);
		driver.findElement(By.id("job_location")).sendKeys("Pune");
		
		Select selJobtype = new Select(driver.findElement(By.id("job_type")));
		selJobtype.selectByVisibleText("Internship");
				
		driver.switchTo().frame("job_description_ifr");
		driver.findElement(By.xpath("//body[@id='tinymce']")).click();
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("training session job created"); 
		driver.switchTo().defaultContent();
		 
		//Click Preview and submit
		driver.findElement(By.xpath("//input[@type='submit' and @value='Preview']")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2"), "Preview"));
		driver.findElement(By.xpath("//input[@type='submit' and @value='Submit Listing']")).click();
		
		//Verify Job Added
		driver.findElement(By.xpath("//a[text()='Jobs']")).click();
		WebElement wbSearchKeyword = driver.findElement(By.id("search_keywords"));
		wbSearchKeyword.sendKeys(Job_name);
		WebElement wbSearchLocation = driver.findElement(By.id("search_location"));
		wbSearchLocation.sendKeys("Pune");
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//ul[@class='job_listings']/li[1]/a//h3"), Job_name));
		String JobName = driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]/a//h3")).getText();
		Assert.assertEquals(JobName, Job_name);
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();		
	}
	
	
}
