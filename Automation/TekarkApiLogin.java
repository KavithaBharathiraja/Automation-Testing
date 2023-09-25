package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TekarkApiLogin {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LaunchApplication();
		Login();
	}
	
	public static void LaunchApplication() {
		
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.get("https://qa01-tekarch-accmanager.web.app/");	
	}
					
	static void Login() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']"));
		username.sendKeys("kavitha.bharathiraja@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Tekarch@123");	
		
		WebElement Login = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		Login.click();
		
	}
	
	
	
	
	
}
