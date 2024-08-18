package CommonMethod;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		WebElement element = driver.findElement(By.xpath("//a[text()='Discount Coupons']"));
		Thread.sleep(1000);
	    //scrollIntoview
		Utility1.ScrollIntoView(driver, element);
		//taking screenshot
		Utility1.Screenshot(driver, "komalsrc");
		
		WebElement textBox= driver.findElement(By.id("name"));
		String FileName="C:\\Users\\Dell\\eclipse\\java-2024-03\\eclipse\\EXCEL\\test1.xlsx";
				textBox.sendKeys(Utility.readDataFromExcel(FileName, "Sheet3", 1, 2));
		
		//read excel
	//	String text = Utility1.ReadDataFromExcel("C:\\Users\\Dell\\eclipse\\java-2024-03\\eclipse\\EXCEL\\test1.xlsx","Sheet2", 3, 3);
		//System.out.println(text);
	}

}
