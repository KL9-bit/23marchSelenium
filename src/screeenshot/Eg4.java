package screeenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Eg4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(100);
		 driver.findElement(By.xpath("//button[text()='Home']")).click();
		Thread.sleep(1000);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	File destination= new File("C:\\Users\\Dell\\Downloads\\Komal\\seleniumscreenshot\\komal1.png");
	
	FileHandler.copy(source, destination);
	Thread.sleep(1000);
	driver.manage().window().minimize();
	
}
}