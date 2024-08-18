package web_Table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice.expandtesting.com/tables");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//how many rows are there?
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		   int text = allrows.size();
	System.out.println(text);
		System.out.println("---------------------------------1----------------------------------------");
//how many columns are there?
		int allc = driver.findElements(By.xpath("//table[@id='table1']//tr[1]//th")).size();
		System.out.println(allc);
		System.out.println("-------------------------------------2------------------------------------");
		for(int i=1;i<=text;i++) {
			for(int j=1;j<=allc;j++) {
			
			WebElement text2 = driver.findElement(By.xpath("//table[@id='table1']//tr["+i+"]//td["+j+"]"));
			Object allrc = text2.getText();
			System.out.print(allrc+" ");
				}
	System.out.println();
		}
			
		
	
	System.out.println("======================================exceptions=======================================");
	//driver.manage().window().minimize();	
	}

}
/*//columns
	 = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
	 int text1=driver.size();
	 System.out.println(text1);

	System.out.println("------------------------------------3-------------------------------------");
for(int j=1;j<=text1;j++) {
		
		String text2 = driver.findElement(By.xpath("//table[@id='table1']//tr//th["+j+"]")).getText();
		System.out.println(text2);*/
			
	
