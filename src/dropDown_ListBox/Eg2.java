package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eg2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		//step1->Identify list box to be handled and store it in reference variable.
		WebElement dropdown = driver.findElement(By.cssSelector("select#multiselect1"));
	    
		Thread.sleep(2000);
		//step2-> create an object of select class which will accept WebElement as argument.
		Select s = new Select(dropdown);
	
		//step3->By using one of the select class methods we can select values form list box like
	      //Swift
	      //s.selectByIndex(1);
	      //s.selectByValue("Swift");
		 s.selectByIndex(1);
		 
	}
}
