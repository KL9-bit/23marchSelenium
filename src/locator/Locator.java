package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
public static void main(String[]arg) throws InterruptedException
{
	WebDriver k=new ChromeDriver();
	k.get("https://drive.google.com/drive/folders/1wnUfClemFpIaGv5kEfeh7QXphIrCUlMd");
	k.manage().window().maximize();
	Thread.sleep(1000);
	k.navigate().refresh();
	k.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(1000);
	k.navigate().back();
	Thread.sleep(1000);
	k.navigate().forward();
	//tagname[@attribute name='attributevalue']
	k.findElement(By.xpath("//input[@value='radio1']")).click();
	
	
	//   //tagname[text() = ‘textvalue’]
	k.findElement(By.xpath("//h1[text()='Practice Page']"));
	Thread.sleep(1000);
	k.findElement(By.xpath("//button[text()='Home']")).click();
	Thread.sleep(1000);
	k.navigate().back();
	k.navigate().refresh();
	k.navigate().to("https://www.google.com/");
	
}
}
