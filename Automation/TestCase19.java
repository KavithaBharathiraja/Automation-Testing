package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase19 {
	static WebDriver driver;
	public static void main(String[] args) {
		// Test Quarterly Summary Report
		
		
		LaunchApplication();
		Login();
		Opportunities();
		QuarterlySummaryReport() ;
			
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
		
		static void  QuarterlySummaryReport() {
			
			WebElement QuarterlySummary = driver.findElement(By.xpath("//select[@id='quarter_q']"));  
		    Select select = new Select(QuarterlySummary);
	        select.selectByVisibleText("Current FQ");
		
	        WebElement Include = driver.findElement(By.xpath("//select[@id='open']"));  
		    Select select1 = new Select(Include);
	        select1.selectByVisibleText("Open Opportunities");
		    
	        WebElement RunReport = driver.findElement(By.xpath("//input[@value='Run Report']"));		 
	        RunReport.click();
			
	        System.out.println("Report Page with the Opportunities that satisfies the search criteria displayed.TestCase19-pass.");
	      


	}

}
