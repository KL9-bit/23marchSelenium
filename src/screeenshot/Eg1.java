package screeenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Eg1 {
	
	public static void main(String[] args) throws IOException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.ajio.com/");
	
	
	File myFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(myFile);
	File desgtination= new File("C:\\Users\\Dell\\Downloads\\komal study\\seleniumscreenshot\\screenshot1.png");
	FileHandler.copy(myFile, desgtination);
	
	
	}

}
















/*long a=2000;
int b=(int)a;//we are using explicit casting here

	WebDriver ddriver= new ChromeDriver();
	TakesScreenshot newdriver = (TakesScreenshot)driver;    //we are using explicit casting here
	
	*/