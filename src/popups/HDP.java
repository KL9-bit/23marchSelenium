package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDP {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.makemytrip.com/");
		 
		 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9834760977");
		 Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(3000);
		
	}

}
