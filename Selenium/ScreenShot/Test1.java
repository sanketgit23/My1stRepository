package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test1 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
		    
		    WebDriver driver = new ChromeDriver();   // Interface object = new class
		                                             // UPCASTING/ CHANGING
		    
		    driver.get("https://www.facebook.com/");  
		    
		    // WAIT
		    Thread.sleep(2000);
		  
		    // TO TAKE THE SCREENSHOT (Typecast/Downcasting/Convert)
		    
		             File  source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		                 
		                 System.out.println(source);
		    
		                 // to copy the screenshot from default folder to the desired folder
		                 
		       File Destination = new File ("C:\\Users\\dell\\Desktop\\Imp\\error.jpg");
		   
		         
		           
		      
		           FileUtils.copyFile(source, Destination);
		           
	}
}
