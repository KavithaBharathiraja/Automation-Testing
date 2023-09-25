package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCase10 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// Create an Account
	       
		LaunchApplication();
		Login();
		Accounts();	
	    CreatingAccount();
		
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
	 static void Accounts(){
		
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
	 }    
	    
	   static void CreatingAccount() {

	    WebElement New = driver.findElement(By.name("new"));
	    New.click();
	    
	    WebElement AccountName = driver.findElement(By.id("acc2"));
	    AccountName.sendKeys("Kavitha Account1");
	    
	    WebElement AccountType = driver.findElement(By.id("acc6"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(AccountType).perform();
	    
	    Select select = new Select(AccountType);
	    select.selectByValue("Technology Partner");
	    
	    WebElement CustomerPriority = driver.findElement(By.id("00NHu00000NHh2Z"));
	    Select select1 = new Select(CustomerPriority);
	    select1.selectByValue("High");
	    
	    // WebElement Save = driver.findElement(By.name("save"));
	    //Save.click();
	    
	    WebElement cancel = driver.findElement(By.name("cancel"));
	    cancel.click();
	    
	    System.out.println("New Account has created.TestCase10-Pass."); 
	   	    	 
	}
	
}
