package tesingselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_browser {
	
	public static void main(String[]args) throws InterruptedException {
		
WebDriver driver	=new ChromeDriver();
driver.get("https://translate.google.co.in/?sl=auto&tl=mr&op=translate");

driver.manage().window().maximize();
Thread.sleep(1000);
//driver.manage().window().minimize();
		
	}

}
