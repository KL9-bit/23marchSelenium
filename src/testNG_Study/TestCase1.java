package testNG_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
	WebDriver driver= new ChromeDriver();
	
	
			
@BeforeClass
public void browser() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get("https://practice.expandtesting.com/login#google_vignette");
	Thread.sleep(2000);
}

@BeforeMethod
public void getelement() throws InterruptedException {
	

	driver.findElement(By.id("username")).sendKeys("practice");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(90,500)");
	Thread.sleep(1000);
	
}


@Test
public void testmain() throws InterruptedException {
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
	
}

@AfterMethod
public void logoutt() throws InterruptedException {
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();
	Thread.sleep(2000);
}

@AfterClass
public void browserclose() {
	driver.close();
	
	
}

}
