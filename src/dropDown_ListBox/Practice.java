package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
public static void main(String[]arg) {
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	WebElement star= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	
	Select s= new Select(star);
	
	//s.selectByIndex(0);
	s.selectByVisibleText("Option3");
	//s.selectByValue();
	
	
} 
}
