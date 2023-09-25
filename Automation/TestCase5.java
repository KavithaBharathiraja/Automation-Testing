package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase5 {
     static WebDriver driver;
	public static void main(String[] args) {
		// Select user menu for <user name> drop down:
		LaunchApplication();
		Login();
		Usermenu();	
		ExpectedCondition();
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
     static void Usermenu() {
 		
 		WebElement usermenu = driver.findElement(By.id("userNav-arrow"));
 		usermenu.click();
			
     }		 
	static void ExpectedCondition() {
		
		WebElement MyProfile = driver.findElement(By.xpath("//a[text()='My Profile']"));
		ExpectedConditions.textToBePresentInElement(MyProfile, "My Profile!");
		
		WebElement MySettings = driver.findElement(By.xpath("//a[text()='My Settings']"));
		ExpectedConditions.textToBePresentInElement(MySettings, "My Settings");
		
		WebElement DeveloperConsole = driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']"));
		ExpectedConditions.textToBePresentInElement(DeveloperConsole, "Developer Console");
		
		WebElement SwitchtoLightningExperience = driver.findElement(By.xpath("//a[@title='Switch to Lightning Experience']"));
		ExpectedConditions.textToBePresentInElement(SwitchtoLightningExperience, "Switch to Lightning Experience");
		
		WebElement Logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		ExpectedConditions.textToBePresentInElement(Logout, "Logout");
		
		System.out.println("User menu drop down Displayed with elements.\nTestCase5");
		driver.quit();
	}
		//Pass	
}
