package screeenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Eg2_random {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 String random = RandomString.make(6);
	File destination = new File("C:\\Users\\Dell\\Downloads\\komal study\\seleniumscreenshot\\screenshotsss"+random+".png");
	FileHandler.copy(source, destination);
	Thread.sleep(3000);
	
	driver.manage().window().minimize();
	}

}