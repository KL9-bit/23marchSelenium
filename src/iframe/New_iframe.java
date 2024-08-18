package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_iframe {

	public static void main(String[] args) throws InterruptedException {
	
WebDriver driver=new ChromeDriver();//here chromedriver is a class
driver.manage().window().maximize();
driver.get("https://www.swiggy.com/");
Thread.sleep(3000);
WebElement search = driver.findElement(By.xpath("//span[text()='Search']"));
search.click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Biryani");

	}

}
