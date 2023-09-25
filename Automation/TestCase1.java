package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	static WebDriver driver;
	public static void main(String[] args) {
		//Login Error Message - 1:
		
		LaunchApplication();
		Username();
		Clearpassword();
		Login();
		
	}	
		
		public static void LaunchApplication() {
				
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
					
			driver.get("https://login.salesforce.com");	
		}
				
		static void Username() {
			
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("kavi@bharathiraja.com");				
		}
		
		static void Clearpassword() {		
			WebElement password = driver.findElement(By.id("password"));
			password.clear();	
		}
		
		static void Login() {

			WebElement Login = driver.findElement(By.id("Login"));
			Login.click();	
					
			WebElement loginError = driver.findElement(By.id("error"));
			ExpectedConditions.textToBePresentInElement(loginError, "Please enter your password.");
			
			System.out.println("'Please enter your password' error message displayed.\nTestCase1-Pass.");
			driver.quit();
		}
	    //'Please enter your password' error message displayed.
		//Pass.
		
}
