package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopups {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='MyBiz Account']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("komalclagade@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("komal");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543033");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Back']")).click();
		
	}
}
