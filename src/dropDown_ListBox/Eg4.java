package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eg4 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	Thread.sleep(100);
	driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
    
	//https:www.softwaretestingmaterial.com/sample-webpage-to-automate/
	
	WebElement multidropdown3 = driver.findElement(By.xpath("//select[@name='multipleselect[]']"));
	Select ss = new Select(multidropdown3);
	ss.selectByIndex(1);
	ss.selectByValue("msmanual");
	ss.selectByVisibleText("Manual Testing");
	
	System.out.println(ss.isMultiple());
	
}
	
}
