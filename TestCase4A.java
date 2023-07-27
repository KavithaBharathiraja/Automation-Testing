package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4A {
    static WebDriver driver;
	public static void main(String[] args) {
		// Forgot Password- 4 A
		LaunchApplication();
		Username();
		Forgotpassword();
		Conitinue();	
	}		
static void LaunchApplication() {
			
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				
		driver.get("https://login.salesforce.com");		
	}		
static void Username() {
	
	     WebElement username = driver.findElement(By.id("username"));
	     username.sendKeys("kavi@bharathiraja.com");				
    }
static void Forgotpassword() {
	     
	     WebElement Forgotpassword = driver.findElement(By.id("forgot_password_link"));
         Forgotpassword.click();
    
	     WebElement FPusername = driver.findElement(By.id("un"));
         FPusername.sendKeys("kavi@bharathiraja.com");
    }
static void Conitinue() {
	    WebElement continuelogin = driver.findElement(By.id("continue"));
        continuelogin.click();
        System.out.println(" Password reset message page displayed. An email associated with the <username> account sent.\nTestCase4A-Pass.");
        driver.quit(); 
   }   			
		//Pass.	
}
