package screeenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotEg1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.findElement(By.xpath("//h5[text()='Kalyani Nagar']")).click();
		
		//Screenshot
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String randomname = RandomString.make(3);
		File destination = new File("C:\\Users\\Dell\\Downloads\\Komal\\seleniumscreenshot\\minal"+randomname+".png");
		FileHandler.copy(source, destination);
	
	
	}
}
