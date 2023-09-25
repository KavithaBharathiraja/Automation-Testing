package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {
	static WebDriver driver;
	public static void main(String[] args) {
		// Check RemeberMe - 3
	
		LaunchApplication();
		Usernameandpassword();
		Rememberme();
		Login();
	    Usermenu();
	    Logout();
	    Validation();	
	}	
     static void LaunchApplication() {
    	 
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				
		driver.get("https://login.salesforce.com");	
	}	
     static void Usernameandpassword() {
 		
 		WebElement username = driver.findElement(By.id("username"));
 		username.sendKeys("kavi@bharathiraja.com");
 		WebElement password = driver.findElement(By.id("password"));
 		password.sendKeys("Password123");					
 	}
	static void Rememberme() {
		WebElement rememberme = driver.findElement(By.id("rememberUn"));
		rememberme.click();	
	}		
	static void Login() {

		WebElement Login = driver.findElement(By.id("Login"));
		Login.click();	
	}	
	static void Usermenu() {
		
		WebElement usermenu = driver.findElement(By.id("userNav-arrow"));
		usermenu.click();		
	}		 
	   static void Logout() {
		  WebElement useroptions = driver.findElement(By.xpath("//a[text()='Logout']"));
		  Actions actions = new Actions(driver);	
		  actions.moveToElement(useroptions).build().perform();
		   
		  WebElement logoutoption = driver.findElement(By.xpath("//a[text()='Logout']"));
		  logoutoption.click();			   
	  }   
	   static void Validation() {
		   
		   WebElement textbox = driver.findElement(By.id("idcard-identity"));
		   String ActualText = textbox.getText();
		   String ExpectedText = "kavi@bharathiraja.com";
		   Assert.assertEquals(ActualText, ExpectedText);  
		   
		   System.out.println("Validation on user name field done.\nTestCase3-pass");
		   driver.quit();
	   }   
	    //pass.
	}


