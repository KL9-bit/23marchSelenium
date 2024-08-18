package web_Table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg3 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//how many rows are there?
		//TNOR= total number of rows
		 List<WebElement> TNOR = driver.findElements(By.xpath("//table[@name='courses']//tr"));
		int text = TNOR.size();
		System.out.println(text);
		System.out.println("====================================================================");
		//TNOC= total number of columns
		 List<WebElement> TNOC = driver.findElements(By.xpath("//table[@name='courses']//tr//th"));
		int text1 = TNOC.size();
		System.out.println(text1);
		System.out.println("====================================================================");
		//how to get all text from rows and columns?
		//outer for loop for rows
		for(int i=2;i<=text;i++) {
			//inner for loop for columns
			for(int j=1; j<=text1;j++)
		{
	String textt = driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]//td["+j+"]")).getText();
		     ;
			System.out.print(textt+"   ");
		}
		System.out.println();
		}

		System.out.println("====================================================================");
			
	}
}
