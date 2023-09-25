package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase12 {
	static  WebDriver driver;
	public static void main(String[] args) {
		// Edit view
		
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
	    
	    WebElement EditView = driver.findElement(By.xpath("//a[text()='Edit']"));  
	    EditView.click();
	    
	    WebElement ViewName = driver.findElement(By.xpath("//input[@id='fname']"));  
	    ViewName.clear();
	    ViewName.sendKeys("Kavitha");
	    
	    WebElement AccountName = driver.findElement(By.xpath("//select[@id='fcol1']"));  
	    Select select = new Select(AccountName);
        select.selectByVisibleText("Account Name");
	    
        WebElement Operator = driver.findElement(By.xpath("//select[@id='fop1']"));  
	    Select select1 = new Select(Operator);
        select1.selectByVisibleText("contains");
	    
        WebElement Value = driver.findElement(By.xpath("//input[@id='fval1']"));  
        Value.sendKeys("a");
	    
        WebElement save = driver.findElement(By.xpath("//input[@class='btn primary']"));  
        save.click();
     
      
        System.out.println(" View page drop down is displayed. TestCase12-Pass.");
        
        
}
		
		
		
		

	}


