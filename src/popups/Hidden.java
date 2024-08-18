package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.makemytrip.com/");
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9876574867");
Thread.sleep(1000);
driver.findElement(By.className("capText font16")).click();
	}

}
