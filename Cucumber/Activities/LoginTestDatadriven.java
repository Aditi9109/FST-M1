package com.jobboard.FST_Cucumber.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class LoginTestDatadriven {
	
	WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User is on Login page$")
    public void loginPage() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    
    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void enterCredentials(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    
    @Then("^Read the page title and confirmation message$")
    public void readTitleAndHeading() {
       String pageTitle = driver.getTitle();
        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Page title is: " + pageTitle);
        System.out.println("Login message is: " + confirmMessage);
    }
    
    @And("^Close the Browser$")
    public void closeBrowser() {
        driver.close();
    }

}