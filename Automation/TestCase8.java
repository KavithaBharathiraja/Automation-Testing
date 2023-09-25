package Automation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase8 {
	static WebDriver driver;
	public static void main(String[] args) {
		// Select "Developers Console" option from
		//user menu for <user name> drop down

		LaunchApplication();
		Login();
		DevelopersConsole();
	
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
		
	static void DevelopersConsole() {
		
		WebElement usermenu = driver.findElement(By.id("userNav-arrow"));
		usermenu.click();
		
	    WebElement DevelopersConsole = driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']"));
	    DevelopersConsole.click();
	          
	    String Parentwindow = driver.getWindowHandle();
	    
	       for(String handle : driver.getWindowHandles () ) {
	    	
	          driver.switchTo () .window (handle);
	    } 
	    driver.close();
	    driver.switchTo () .window (Parentwindow);
        
	    System.out.println("Developer Console window is closed.TestCase8-Pass.");
	}

}
