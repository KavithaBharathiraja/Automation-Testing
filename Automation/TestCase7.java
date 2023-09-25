package Automation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase7 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		//Select "My settings" option from 
		//user menu for <user name> drop down
			
		LaunchApplication();
		Login();
	    MySettings();
	    PersonalLoginhistory();
	    DisplayandLayout();
	    Email();
	    CalanderandReminders();
	    
		
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
		
	 static void MySettings() {
		 	
	    WebElement usermenu = driver.findElement(By.id("userNav-arrow"));
		usermenu.click();
		
		WebElement useroptions = driver.findElement(By.xpath("//a[text()='My Settings']"));
	    Actions actions = new Actions(driver);	
	    actions.moveToElement(useroptions).build().perform();
		
	    WebElement Myprofile = driver.findElement(By.xpath("//a[text()='My Settings']"));
	    Myprofile.click();
	 }
	 
	 static void PersonalLoginhistory() {
	    WebElement Personal = driver.findElement(By.id("PersonalInfo_font"));
		Personal.click();
		
		WebElement Loginhistory = driver.findElement(By.id("LoginHistory_font"));
	    Actions action = new Actions(driver);	
	    action.moveToElement(Loginhistory).build().perform();
		
	    WebElement LoginHistory = driver.findElement(By.id("LoginHistory_font"));
	    LoginHistory.click();
	    
	    driver.manage().window().maximize();
	 }
	 
	 static void DisplayandLayout() {
		 
		 WebElement Displayandlayout = driver.findElement(By.id("DisplayAndLayout_font"));
		 Actions action = new Actions(driver);	
		 action.moveToElement(Displayandlayout).build().perform();
		
	     WebElement DisplayandLayout = driver.findElement(By.id("DisplayAndLayout_font"));
	     DisplayandLayout.click();
	     
	     WebElement Customize = driver.findElement(By.id("CustomizeTabs_font"));
	     Customize.click();
	     
	     WebElement TextboxCustomApp = driver.findElement(By.id("p4"));
	     TextboxCustomApp.click();
	     
	     WebElement SalesforceChatter = driver.findElement(By.id("p4"));
         Select select = new Select(SalesforceChatter);
         select.selectByVisibleText("Salesforce Chatter");
         
         WebElement Report = driver.findElement(By.xpath("//option[@value='report']"));
	     Report.click();
         
	     WebElement Add = driver.findElement(By.xpath("//img[@class='rightArrowIcon'] "));
	     Add.click();
	     
	     WebElement Textbox = driver.findElement(By.id("p4"));
	     Textbox.click();
	     
	     WebElement Sales = driver.findElement(By.id("p4"));
         Select select1 = new Select(Sales);
         select1.selectByVisibleText("Sales");
          
         //driver.switchTo().alert().accept();
         
         WebElement Report1 = driver.findElement(By.xpath("//option[@value='report']"));
	     Report1.click();
         
	     WebElement Add1 = driver.findElement(By.xpath("//img[@class='rightArrowIcon'] "));
	     Add1.click();
	      
	     WebElement Textbox1 = driver.findElement(By.id("p4"));
	     Textbox1.click();
	     
	     WebElement Marketing = driver.findElement(By.id("p4"));
         Select select2 = new Select(Marketing);
         select2.selectByVisibleText("Marketing");
         
         //driver.switchTo().alert().accept();
         
         WebElement Report2 = driver.findElement(By.xpath("//option[@value='report']"));
	     Report2.click();
         
	     WebElement Add2 = driver.findElement(By.xpath("//img[@class='rightArrowIcon'] "));
	     Add2.click();
	     
	     //WebElement Save = driver.findElement(By.xpath("//input[@value=' Save ']"));
	     //Save.click();
	     
	     WebElement VerifyReport = driver.findElement(By.xpath("//option[@value='report']"));
	     ExpectedConditions.textToBePresentInElement(VerifyReport, "Reports"); 
	     
	     WebElement VerifyReportSalesforceChatter = driver.findElement(By.xpath("//a[@title='Reports Tab']"));
		 ExpectedConditions.textToBePresentInElement(VerifyReportSalesforceChatter, "Reports"); 
		 	 
	}
	 
	 static void Email() {
		 
		 WebElement Email = driver.findElement(By.id("EmailSetup_font"));
	     Email.click();
	     
	     WebElement MyEmailSettings = driver.findElement(By.id("EmailSettings_font"));
	     MyEmailSettings.click();
		 
	     WebElement EmailName = driver.findElement(By.id("sender_name"));
	     EmailName.sendKeys("Bharathiraja");
	     
	     WebElement EmailAddress = driver.findElement(By.id("sender_email"));
	     EmailAddress.sendKeys(" ");
	     
	     WebElement Bcc = driver.findElement(By.id("auto_bcc1"));
	     Bcc.click();
	     
	     WebElement Save = driver.findElement(By.name("save"));
	     Save.click();
	     
	     driver.switchTo().alert().accept();
	    	
	 }
	 static void CalanderandReminders() {
		 
		 WebElement CalanderandReminders = driver.findElement(By.id("CalendarAndReminders_font"));
		 CalanderandReminders.click();
		 
		 WebElement ActivityReminders = driver.findElement(By.id("Reminders_font"));
		 ActivityReminders.click();
		 
		 WebElement OpenAtestReminders = driver.findElement(By.name("test"));
		 OpenAtestReminders.click();
		  
		System.out.println("Sample event pop window is dispayed.TestCase7-pass.");
				 	 
	  }	 		 
	 }


