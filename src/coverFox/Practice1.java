package coverFox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions(); 
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("inventory_item_img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='1']")).click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
	}

}
