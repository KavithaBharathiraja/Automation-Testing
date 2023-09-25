package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase15 {
	static WebDriver driver;
	public static void main(String[] args) {
		// opportunities drop down
		LaunchApplication();
		Login();
	    Opportunities() ;
	    ValidateOpportunitydropdown();
				
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
		
		static void Opportunities() {
			
			WebElement Opportunities = driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));		 
			Opportunities.click();
		
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			    WebElement XAlert = driver.findElement(By.id("tryLexDialogX"));  
			    XAlert.click();
	}

		static void ValidateOpportunitydropdown() {
			
			
			WebElement OptyDropdown = driver.findElement(By.xpath("//select[@id='fcf']"));		 
			OptyDropdown.click();
		
			WebElement AllOpportunities = driver.findElement(By.xpath("//a[text()='My Profile']"));
			ExpectedConditions.textToBePresentInElement(AllOpportunities, "All Opportunities");
				
			WebElement ClosingNextMonth = driver.findElement(By.xpath("//a[text()='My Profile']"));
			ExpectedConditions.textToBePresentInElement(ClosingNextMonth, "Closing Next Month");
					
			WebElement ClosingThisMonth = driver.findElement(By.xpath("//a[text()='My Profile']"));
			ExpectedConditions.textToBePresentInElement(ClosingThisMonth, "Closing This Month");
			
			WebElement MyOpportunities = driver.findElement(By.xpath("//a[text()='My Profile']"));
			ExpectedConditions.textToBePresentInElement(MyOpportunities, "My Opportunities");
			
			WebElement NewThisWeek = driver.findElement(By.xpath("//a[text()='My Profile']"));
			ExpectedConditions.textToBePresentInElement(NewThisWeek, "New This Week");
			
			WebElement RecentlyViewedOpportunities = driver.findElement(By.xpath("//a[text()='My Profile']"));
			ExpectedConditions.textToBePresentInElement(RecentlyViewedOpportunities, "Recently Viewed Opportunities");
			
			WebElement Won = driver.findElement(By.xpath("//a[text()='My Profile']"));
			ExpectedConditions.textToBePresentInElement(Won, "Won");
			
			System.out.println("AllOpportunities dropdown is available and verified.TestCase15-Pass.");
			
		}
		
		
}
