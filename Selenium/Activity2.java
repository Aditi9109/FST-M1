package TestQA.Selenium_FST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.training-support.net");
		 
		 String pageTitle = driver.getTitle();
		 System.out.println("Page title :"+pageTitle);
		 
		 WebElement wb = driver.findElement(By.xpath("//a[@id='about-link']"));
		 String buttontext = wb.getText();
		 System.out.println("Button text :"+buttontext);
		 
		 driver.quit();
		 
	}

}
