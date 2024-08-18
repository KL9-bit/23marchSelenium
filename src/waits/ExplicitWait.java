package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
      public static void main(String[] args) {
		
    	  WebDriver driver= new ChromeDriver();
    	  
    	  driver.manage().window().maximize();
    	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");

WebDriverWait w= new WebDriverWait(driver,Duration.ofMillis(10000));
         
          w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='radio1']")));
          
          driver.findElement(By.xpath("//input[@value='radio1']")).click();
          
    	  driver.close();
	}
	
	
}
