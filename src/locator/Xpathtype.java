package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtype {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("how to work on yourself");
		
		
		driver.manage().window().maximize();// for fullscreen
	
		//driver.findElement(By.xpath(null))
		//driver.findElement(By.xpath("//a[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Material')]")).click();
		
		//(//tagname[@attribute name = ‘attribute value’] )[2]
		//(//h1[contains(text(),'Practice Page')])[1]
	//	driver.findElement(By.xpath("//h1[contains(text(),'radio1')])[1]")).click();
		

	}

}
