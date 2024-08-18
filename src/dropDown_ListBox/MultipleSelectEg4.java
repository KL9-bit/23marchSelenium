package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectEg4 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//step1
		WebElement dropdownn = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select stst = new Select(dropdownn);
		stst.selectByIndex(3);
		Thread.sleep(1000);
		
		WebElement dropdownn1 = driver.findElement(By.xpath("//select[@name='SiteMap']"));
		Select stat = new Select(dropdownn1);
		stat.selectByValue("mno");
		
		Thread.sleep(1000);
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select stt = new Select(dropdown2);
		stt.selectByIndex(1);
		
		//to check if drop down is multi selectable or not
		System.out.println(stt.isMultiple());//true
		System.out.println(stst.isMultiple());//true
		System.out.println(stat.isMultiple());//false
		
		
	}

}
