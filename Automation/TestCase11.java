package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase11 {
  static  WebDriver driver;
  
	public static void main(String[] args) {
		// Create new view
		
		 LaunchApplication();
		 Login();
		 Accounts();
			
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
	 static void Accounts() {
		
		WebElement Accounts = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));		 
		Accounts.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    WebElement XAlert = driver.findElement(By.id("tryLexDialogX"));  
	    XAlert.click();
	    
	    WebElement CreateNewView = driver.findElement(By.xpath("//a[text()='Create New View']"));		 
	    CreateNewView.click();
	    
	    
	    WebElement FName = driver.findElement(By.xpath("//input[@id=\"fname\"]"));		 
	    FName.sendKeys("kavitha");
	    
	    WebElement UniqueName = driver.findElement(By.id("devname"));		 
	    UniqueName.click();
	    UniqueName.sendKeys("bharathi");
	    
	    WebElement Save = driver.findElement(By.xpath("//input[@class='btn primary']"));		 
	    Save.click();
	  
	    
	  System.out.println("Newely added View displayed in the account view list.TestCase11-Pass.");
	    
	    
	}
		
		
		

	}


