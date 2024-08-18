package tesingselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.google.com/");
Thread.sleep(1000);
driver.close();
}

}
