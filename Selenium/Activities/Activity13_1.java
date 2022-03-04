package TestQA.Selenium_FST;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Activity13_1 {

	public static void main(String[] args) throws IOException, CsvException {
		
		WebDriver driver = new FirefoxDriver();
		CSVReader reader = new CSVReader(new FileReader("C://Users//001YLY744//EclipseTraining_WS//Selenium_FST//src//main//java//TestQA//Selenium_FST//Activity13csv.csv"));
		
		List<String[]> list = reader.readAll();
		System.out.println("Total rows in csv files: " + list.size());
		
		Iterator<String[]> itr = list.iterator();		
		while(itr.hasNext()) {
		    String[] str = itr.next();

		    System.out.print("CSV file values: ");
		    for(int i=0;i<str.length;i++) {
		        System.out.print(" " + str[i]);
		    }
		        System.out.println(" ");
		}
		reader.close();
        driver.quit();
       
	}
}
