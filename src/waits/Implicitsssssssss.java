package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Implicitsssssssss {
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	

driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
 driver.findElement(By.name("q")).sendKeys("velocity");

	
	
}
	
}
