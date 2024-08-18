package web_Table;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract_of_all {
public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
		driver.get("https://practice.expandtesting.com/tables");
		
		//how many row in table
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
		int TotalRow = row.size();
		System.out.println("Total rows is "+TotalRow);
		//how many column in table
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='table1']//th"));
		int TotalColumn = column.size();
		
		System.out.println("Total number of columns "+TotalColumn);
		
		//how to read all data from table
		
		for(int i=1;i<=TotalColumn;i++) {
			WebElement header = driver.findElement(By.xpath("//table[@id='table1'] /thead/tr/th["+i+"]"));
			String text1 = header.getText();
			System.out.print(text1+"      ");
		}
		System.out.println();
		//System.out.println("==========================================");
		
		for(int i=1;i<=TotalRow;i++) {
			for(int j=1;j<=TotalColumn;j++) {
				WebElement table = driver.findElement(By.xpath("//table[@id='table1']//tbody /tr["+i+"]/td["+j+"]"));
				String text = table.getText();
				System.out.print(text+" ");
			}
			System.out.println();
		}
		
	}

}