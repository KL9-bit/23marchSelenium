package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	Thread.sleep(1000);
	WebElement idField = driver.findElement(By.id("src"));
	Actions act=new Actions(driver);
	
	act.keyDown(idField,Keys.SHIFT).sendKeys("pune").keyUp(Keys.SHIFT).build().perform();
	for(int k=1;k<=1;k++)
	{
		act.sendKeys(Keys.ARROW_DOWN).perform();
			}
	Thread.sleep(1000);
	act.click(idField);

act.sendKeys(Keys.ENTER).perform();
	//------------------------------------------------------------------
	WebElement DField = driver.findElement(By.id("dest"));
	act.keyDown(DField,Keys.SHIFT).sendKeys("delhi").keyUp(Keys.SHIFT).build().perform();
	Thread.sleep(1000);


	act.click(DField);
	act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(1000);
	
	//-----------------------------------
	WebElement TextField = driver.findElement(By.xpath("//span[text()='23']"));
	Thread.sleep(1000);
	act.click(TextField).perform();
	
	//-----------------------------
	WebElement searchField = driver.findElement(By.id("search_button"));
	act.click(searchField).perform();
 }	
}