package screeenshot;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Random_Src {

	public static void main(String[] args) throws InterruptedException, IOException {
			
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
     Thread.sleep(3000);
		File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(Src);
		 String random = RandomString.make(3);
		File desc=new File("C:\\Users\\Dell\\Downloads\\Komal\\seleniumscreenshot\\sreenshot4"+random+".png");
		FileHandler.copy(Src, desc);
				
				
	}

}

