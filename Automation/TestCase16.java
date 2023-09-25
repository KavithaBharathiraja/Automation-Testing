package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase16 {
	static WebDriver driver;
	public static void main(String[] args) {
		// Create a new Opportunities
		LaunchApplication();
		Login();
		Opportunities();
		CreateNewOpportunity();
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
   static void CreateNewOpportunity() {
	
	      WebElement newOpportunities = driver.findElement(By.xpath("//input[@name='new']"));		 
		  newOpportunities.click();
	
		  WebElement OPtyname = driver.findElement(By.xpath("//input[@id='opp3']"));		 
		  OPtyname.sendKeys("OpportunityAccount1");
		  
		  WebElement Accountname = driver.findElement(By.xpath("//input[@id='opp4']"));		 
		  Accountname.sendKeys("Anju");
		  
		  WebElement CloseDate = driver.findElement(By.xpath("//input[@id='opp9']"));		 
		  CloseDate.click();
		  
		  WebElement CloseDate1 = driver.findElement(By.xpath("//td[text()='31']"));		 
		  CloseDate1.click();
		  
		  WebElement Stage = driver.findElement(By.xpath("//select[@id='opp11']"));		 
		  Select select = new Select(Stage);
	      select.selectByVisibleText("Value Proposition");
		   
		  WebElement Probability = driver.findElement(By.xpath("//input[@id='opp12']"));		 
		  Probability.sendKeys("%");
	
		  //WebElement LeadSource = driver.findElement(By.xpath("//select[@id='opp11']"));		 
		  //Select select1 = new Select(LeadSource);
	      //select1.selectByVisibleText("Web");
	      
	      WebElement Save= driver.findElement(By.xpath("//input[@value=' Save ']"));		 
		  Save.click();
		  
		  System.out.println("New Opportunity page displayed with Opportunity details.TestCase16-Pass.");
	
   }
	
	
}
