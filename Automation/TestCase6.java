package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase6 {
	static WebDriver driver;
	// Select "My Profile" option from user menu
	// for <user name> drop down

	public static void main(String[] args) {

		LaunchApplication1();
		Login();

	}

	static void LaunchApplication1() {

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
	static void myprofile() {

	WebElement profile = driver.findElement(By.xpath(" //a[contains (text (), 'My Profile')]"));
	profile.click();
	
	}
	static void editprofile() throws InterruptedException {
    Thread.sleep(3000);
	WebElement editprofile = driver.findElement (By.xpath("//img[@alt='Edit Profile']"));
	Actions actions = new Actions(driver);	
    actions.moveToElement(editprofile ).build().perform();
    
    
	}
	
	
	
}
