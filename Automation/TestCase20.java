package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase20 {
	static WebDriver driver;
	public static void main(String[] args) {
		
		//check leads tab link 
		//Application launched and user logged in
		//User logged out and application closed
		LaunchApplication();
		Login();
		Leadslink();
		Logout();
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
	static void Leadslink() {
		
		WebElement Leadslink = driver.findElement(By.xpath("//a[text()='Leads']"));
		Leadslink.click();
		
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    WebElement XAlert = driver.findElement(By.id("tryLexDialogX"));  
		    XAlert.click();	
		
	}
		
	static void Logout() {
		  WebElement useroptions = driver.findElement(By.xpath("//a[text()='Logout']"));
		  Actions actions = new Actions(driver);	
		  actions.moveToElement(useroptions).build().perform();
		   
		  WebElement logoutoption = driver.findElement(By.xpath("//a[text()='Logout']"));
		  logoutoption.click();			   
	    
		
	     System.out.println("Link navigated to Leads Home page.TestCase20-Pass.");
}
	
	}	


