package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eg3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	Thread.sleep(2000);
	//step1
	WebElement dropdown = driver.findElement(By.xpath("//select[@name='SiteMap']"));
	//step2
	Select s = new Select(dropdown);
    //step3
	s.selectByIndex(3);

	
}
}
