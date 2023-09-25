package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase22 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// Functionality of the Go Button
		//Application launched and user logged in
		//User logged out and application closed


		LaunchApplication();
		Login();
		Leadslink();
	
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
	static void Leadslink() throws InterruptedException {
		
		WebElement Leadslink = driver.findElement(By.xpath("//a[text()='Leads']"));
		Leadslink.click();
		
		Thread.sleep(2000);
		
		    WebElement XAlert = driver.findElement(By.id("tryLexDialogX"));  
		    XAlert.click();
	}

	
}
	

