package TestQA.Selenium_FST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: "+pageTitle);
        
        WebElement cube = driver.findElement(By.id("wrapD3Cube"));
        actions.click(cube);
        WebElement cubeVal = driver.findElement(By.className("active"));
        System.out.println("Click1: " + cubeVal.getText());
 
        actions.doubleClick(cube).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("double click: " + cubeVal.getText());
        
        actions.contextClick(cube).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Right Click: " + cubeVal.getText());
 
        driver.quit();
        

	}

}
