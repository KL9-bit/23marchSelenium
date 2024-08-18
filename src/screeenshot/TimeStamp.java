package screeenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TimeStamp {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		//String timeStamp= new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		//System.out.println(timeStamp);
		String TimeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		System.out.println(TimeStamp);
		File destination=new File("C:\\Users\\Dell\\Downloads\\Komal\\seleniumscreenshot\\k"+TimeStamp+".png");
		
			FileHandler.copy(src, destination);
				Thread.sleep(3000);
				
				driver.close();
		}

}
