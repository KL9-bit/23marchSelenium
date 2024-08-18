package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Just {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.zomato.com/");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//img[@alt='Dining']")).click();
	Thread.sleep(3000);
	
	
	driver.manage().window().minimize();
	
}
}
