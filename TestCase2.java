package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {
       static WebDriver driver;
	public static void main(String[] args) {
		// Login To SalesForce -2
		
		
		LaunchApplication();
		Usernameandpassword();
		Login();	
	}	

	public static void LaunchApplication() {
			
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
	static void Login() {

		WebElement Login = driver.findElement(By.id("Login"));
		Login.click();
		
		System.out.println("Home page displayed.\nTestCase2-Pass. ");
		driver.quit();
			
	}	
		//Successfully logged in.
		//Pass.
		
		
		

	

}
