package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEg {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php");
		WebElement nameField = driver.findElement(By.name("firstname"));
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		
		//act.sendKeys(nameField, "komal").perform();
		act.keyDown(nameField, Keys.SHIFT).sendKeys("komal").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(1000);
		
		//lastname
		//--------------------------------------------------------------------------------
		//1
		WebElement dayfield = driver.findElement(By.id("day"));
		
		//2
		Actions acts = new Actions(driver);
		//3.
		acts.click(dayfield).perform();
		for(int i=1;i<=13;i++)
		{
			//Thread.sleep(1000);
			acts.sendKeys(Keys.ARROW_UP).perform();
			
		 driver.findElement(By.id("day"));
		}
		
		acts.sendKeys(Keys.ENTER).perform();
	//---------------------------------------------------------------------------------
		Thread.sleep(1000);
		WebElement MField = driver.findElement(By.id("month"));
		Actions action = new Actions(driver);
		
		action.click(MField).perform();
		for(int j=1;j<=0;j++) {
			Thread.sleep(1000);
			action.sendKeys(Keys.ARROW_UP).perform();
			
		}
		action.sendKeys(Keys.ENTER).perform();
	//-----------------------------------------------------------------------------------
		driver.findElement(By.id("month"));
		
		Thread.sleep(1000);
		WebElement YField = driver.findElement(By.id("year"));
		
		//Actions A = new Actions(driver);
		action.click(YField).perform();
		for(int k=1;k<=29;k++)
		{
			action.sendKeys(Keys.ARROW_DOWN).perform();
			
		}
		Thread.sleep(1000);
		action.sendKeys(Keys.ENTER).perform();
		
		WebElement VField = driver.findElement(By.xpath("//input[@value='1']"));
		Thread.sleep(1000);
	Actions AC = new Actions(driver);
	AC.click(VField);
	AC.sendKeys(Keys.ENTER).perform();
	
	//-----------------------------
	
	
	WebElement surnameField = driver.findElement(By.name("lastname"));
	//Actions aact = new Actions(driver);
	Thread.sleep(1000);
	action.keyDown(surnameField, Keys.SHIFT).sendKeys("Lagade").keyUp(Keys.SHIFT).build().perform();
	Thread.sleep(3000);

	driver.close();
	
	}

}