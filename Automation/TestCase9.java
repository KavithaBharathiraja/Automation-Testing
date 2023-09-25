package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase9 {
	static WebDriver driver;
	public static void main(String[] args) {
		// Select "Logout" option from 
		//user menu for <user name> drop down
		LaunchApplication();
		Login();
		Logout() ;	
	   }	
	 static void LaunchApplication() {
			
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
					
			driver.get("https://login.salesforce.com");		
		}
	 static void Login() {
    	 
	    	WebElement username = driver.findElement(By.id("username"));
	 	    username.sendKeys("kavi@bharathiraja.com");
	 			
	 		WebElement password = driver.findElement(By.id("password"));
	 		password.sendKeys("Password123");
	 		
	 		WebElement Login = driver.findElement(By.id("Login"));
	 		Login.click();
	     }		 
	 static void Logout() {
		 
		  WebElement usermenu = driver.findElement(By.id("userNav-arrow"));
		  usermenu.click();
			
		  WebElement useroptions = driver.findElement(By.xpath("//a[text()='Logout']"));
		  Actions actions = new Actions(driver);	
		  actions.moveToElement(useroptions).build().perform();
		   
		  WebElement logoutoption = driver.findElement(By.xpath("//a[text()='Logout']"));
		  logoutoption.click();	
		  
		  System.out.println("Logedout and https://login.salesforce.com/ page is displayed.TestCase9-Pass.");
		  
	  }		
      //Pass.
}
