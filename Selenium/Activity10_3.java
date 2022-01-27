package TestQA.Selenium_FST;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        driver.get("https://training-support.net/selenium/drag-drop");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: "+pageTitle);  
       

        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
        
        Actions dragAndDrop = new Actions(driver);
        dragAndDrop.dragAndDrop(ball, dropzone1).build().perform();
        
        boolean bgcolordisplay1 = dropzone1.getAttribute("style").contains("background-color:");
        if(bgcolordisplay1)
        {
        	System.out.println("Color changed for dropzone1");  
        	dragAndDrop.dragAndDrop(dropzone1, dropzone2).build().perform();
        	 boolean bgcolordisplay2 = dropzone1.getAttribute("style").contains("background-color:");
        	 if(bgcolordisplay1)
             {System.out.println("Color changed for dropzone2"); }
        	 else
        	 {System.out.println("Color DID NOT change for dropzone2"); }
        }
        else
   	 {System.out.println("Color DID NOT change for dropzone2"); }
	}

}
