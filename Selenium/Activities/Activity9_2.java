package TestQA.Selenium_FST;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
        WebElement selectedValue = driver.findElement(By.id("multi-value"));
        Select multiList = new Select(driver.findElement(By.id("multi-select")));
        
        if(multiList.isMultiple()) {
        
            multiList.selectByVisibleText("Javascript");
            System.out.println(selectedValue.getText());
            multiList.selectByValue("node");
            System.out.println(selectedValue.getText());
            
            for(int i=4; i<=6; i++) {
                multiList.selectByIndex(i);
            }
            
            System.out.println(selectedValue.getText());
    
           
            multiList.deselectByValue("node");
            System.out.println(selectedValue.getText());
            
            multiList.deselectByIndex(7);
            System.out.println(selectedValue.getText());
           
            List<WebElement> selectedOptions = multiList.getAllSelectedOptions();
            for(WebElement selectedOption : selectedOptions) {
                System.out.println("Selected option: " + selectedOption.getText());
            }
            
            multiList.deselectAll();
            System.out.println(selectedValue.getText());
        }        
        driver.quit();
        
	}

}