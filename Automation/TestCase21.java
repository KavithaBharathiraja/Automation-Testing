package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase21 {
	static WebDriver driver;
	public static void main(String[] args) {
		// Validate 'View' drop down list contents
		//Application launched and user logged in
		//User logged out and application closed
		
		LaunchApplication();
		Login();
		Leadslink();
		ValidationOfLeadsDropdown();
		
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
		static void ValidationOfLeadsDropdown() {
			
			WebElement LeadsDropdown= driver.findElement(By.xpath("//select[@id='fcf']"));		 
			LeadsDropdown.click();
			
			WebElement AllOpenLeads  = driver.findElement(By.xpath("//select[@id='fcf']"));
			ExpectedConditions.textToBePresentInElement(AllOpenLeads,"All Open Leads");
			
			WebElement MyUnreadLeads  = driver.findElement(By.xpath("//select[@id='fcf']"));
			ExpectedConditions.textToBePresentInElement(MyUnreadLeads, "My Unread Leads");
			
			WebElement RecentlyViewedLeads  = driver.findElement(By.xpath("//select[@id='fcf']"));
			ExpectedConditions.textToBePresentInElement(RecentlyViewedLeads,"Recently Viewed Leads");
			
			WebElement TodaysLeads  = driver.findElement(By.xpath("//select[@id='fcf']"));
			ExpectedConditions.textToBePresentInElement(TodaysLeads,"Today's Leads");
			
			System.out.println("Leads drop down showed the contents.TestCase21-pass.");
			
		}		

	}


