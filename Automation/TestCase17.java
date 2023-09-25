package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase17 {
	static WebDriver driver;
	public static void main(String[] args) {
		// Test Opportunity Pipeline Report
		
		LaunchApplication();
		Login();
		Opportunities();
		OpportunityPipelineReport();
		
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
		
	static void OpportunityPipelineReport() {
		
		WebElement OpportunityPipelineReport = driver.findElement(By.xpath("//a[text()='Opportunity Pipeline']"));		 
		OpportunityPipelineReport.click();
		
		driver.manage().window().maximize();
		driver.close();
		
		System.out.println("Report Page with the Opportunities that are pipelined displayed.TestCase17-Pass.");
	}
		
		
		

	}


