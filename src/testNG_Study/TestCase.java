package testNG_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase {
	WebDriver driver=new ChromeDriver();
	
	@BeforeClass
	public void openbrowser() throws InterruptedException {
	
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		Thread.sleep(1000);		
	}
	
	@BeforeMethod
	public void idpass() throws InterruptedException{
		
				 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
				 Thread.sleep(2000);
	}
	/*@BeforeMethod
	public void idwrongpass() throws InterruptedException{
 
				 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_use");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
				 Thread.sleep(2000);
	}
	@BeforeMethod
	public void idpasswrong() throws InterruptedException{
		 
		 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_use");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sau");
		 Thread.sleep(2000);
}
	
	@BeforeMethod
	public void idwrongpasswrong() throws InterruptedException{
 
				 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_us");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauc");
				 Thread.sleep(2000);
	}
	*/
	
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//input[@id='login-button']")).click();
	   Thread.sleep(2000);
  }
    
   @AfterMethod
   public void logout() throws InterruptedException {
	   driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[text()='Logout']")).click();
	   Thread.sleep(2000);  
   }
   
   
   @AfterClass
   public void closebrowser() throws InterruptedException {
	   Thread.sleep(2000);
	   driver.close();
   }
  
  
  
}
