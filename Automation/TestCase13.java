package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase13 {
  static WebDriver driver;
	public static void main(String[] args) {
		// Merge accounts
		
		LaunchApplication();
		Login();
		Accounts();	
		MergeAccounts();
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
   }
   static void MergeAccounts() {
	   
		    
	    WebElement XAlert = driver.findElement(By.id("tryLexDialogX"));  
	    WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(XAlert));
	    wait.until(ExpectedConditions.elementToBeClickable(XAlert));
	    XAlert.click();
	    
	    WebElement MergeAccounts = driver.findElement(By.xpath("//a[text()='Merge Accounts']"));  
	    MergeAccounts.click();
	    
	    WebElement FindAccount = driver.findElement(By.xpath("//input[@id='srch']"));  
	    FindAccount.sendKeys("kavitha");
	    
	    
	    WebElement FindAccounts = driver.findElement(By.xpath("//input[@value='Find Accounts']"));  
	    FindAccounts.click();
	    
	    WebElement Account1 = driver.findElement(By.xpath("//input[@id='cid1']"));  
	    Account1.click();
	    
	    WebElement Account2 = driver.findElement(By.xpath(" //input[@id='cid2']"));  
	    Account2.click();
	    
	    WebElement Next = driver.findElement(By.xpath("//input[@name='goNext']"));  
	    Next.click();
	    
	    WebElement Merge = driver.findElement(By.xpath("//input[@value=' Merge ']"));  
	    Merge.click();
	    
	    driver.switchTo().alert().dismiss();
	  
	    System.out.println(" New pop up for account merge confirmation displayed.TestCase13-Pass.");
}
		
	}


