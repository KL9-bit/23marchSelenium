package screeenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Eg3 {


	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		
		File Scrnsht = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Dell\\Downloads\\Komal\\seleniumscreenshot\\komal.png");
	    FileHandler.copy(Scrnsht, Destination);
	    Thread.sleep(100);
	    
	    driver.manage().window().minimize();
		
		
	}

}
