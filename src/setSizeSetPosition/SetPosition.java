package setSizeSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		Point P = driver.manage().window().getPosition();
		System.out.println(P);
		Thread.sleep(1000);
		Point point = new Point(500, 10);
		driver.manage().window().setPosition(point);
		System.out.println(point);
		Point P1 = new Point(900,89);
		driver.manage().window().setPosition(P1);
		
		
		Thread.sleep(3000);
		driver.manage().window().minimize();
	}

}
