package screeenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Practice {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		

		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String random= RandomString.make(3);
		File destination=new File("C:\\Users\\Dell\\Downloads\\Komal\\seleniumscreenshot\\src111"+random+".png");

		FileHandler.copy(source,destination);
				
	}

}