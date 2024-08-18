package zpracticeforSelenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Practice {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		String timestamp = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
		System.out.println(timestamp);
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='Sign In']")).click();//syntax: for Xpath with text= (//tagname[text()='text'])
	Thread.sleep(3000);
	driver.navigate().refresh();
	driver.findElement(By.xpath("//span[text()='Search']")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	
	//String timeStamp= new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	//System.out.println(timeStamp);
	 

	File myFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(myFile);
  String myfile = RandomString.make(3);
	File destination= new File("C:\\Users\\Dell\\Downloads\\Komal\\seleniumscreenshot\\sc"+myfile+".png");
	FileHandler.copy(myFile, destination);
	
	Thread.sleep(3000);

	}
	
}
