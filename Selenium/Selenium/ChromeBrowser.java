package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser 
{

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/deals?ref_=nav_cs_gb");
	
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	  

	// Find all elements with the class 's-result-item'
    List<WebElement> items = driver.findElements(By.xpath("//img[@class=\"s-image\"]"));


    // Print the total number of items
    System.out.println("Total number of items displayed on the webpage: " + items.size());

    // Close the browser
    driver.quit();
}

   
}


	
	

