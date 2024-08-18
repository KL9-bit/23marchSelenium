package scrollUse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolluse {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.blackanddecker.com/");
	Thread.sleep(3000);
	
	WebElement namefield = driver.findElement(By.name("q"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
		
	js.executeScript("arguments[0].scrollIntoView(true)",namefield);
	Thread.sleep(2000);
	namefield.click();
	Thread.sleep(1000);
	namefield.sendKeys("Ac");
	
	Thread.sleep(1000);
	
	
	
	
	}

}
