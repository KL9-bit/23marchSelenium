package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
		
		
		driver.findElement(By.xpath("//button[text()='Home']")).click();
		
	}

}
