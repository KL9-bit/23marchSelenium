package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='sc-ktPPKK hNKZmg'])[68]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='create an account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9087764421");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("komal");
		driver.findElement(By.id("email")).sendKeys("komalclagade@gmail.com");
		Thread.sleep(3000);
		
	}

}
