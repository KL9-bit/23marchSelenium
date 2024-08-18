package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathh {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h5[text()='Baner']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Delivery']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Cuisines']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Japanese");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Apply'])[1]")).click();
		
	}

}