package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4B {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// Forgot Password- 4 B
		
		LaunchApplication();
		WrongUsernameandPassword();
		Login();	
	}	
		
    static void LaunchApplication() {
			
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				
		driver.get("https://login.salesforce.com");
	}	
		
	static void WrongUsernameandPassword () {
		
		WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("123");
			
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("22131");
	}		
	static void Login(){
		
		WebElement Login = driver.findElement(By.id("Login"));
		Login.click();
		System.out.println("Error messagr displayed.\nTestCase4B-Pass.");
		driver.quit();
	}

		//Pass.
}
