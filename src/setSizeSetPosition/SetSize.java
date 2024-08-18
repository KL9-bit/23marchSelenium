package setSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver= new ChromeDriver();
	    //driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		Dimension defaultsize = driver.manage().window().getSize();
		System.out.println(defaultsize);
		
		//to set the Size we need to create object of Dimension class
		Thread.sleep(2000);
		Dimension d = new Dimension(500,1050);	
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		Dimension d1 = new Dimension(1350, 550);
		driver.manage().window().setSize(d1);
		
		Thread.sleep(1000);	
	driver.manage().window().minimize();
	}
}