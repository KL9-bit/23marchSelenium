package miscellaneous;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNumberOfLinks {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(1000);
	List<WebElement> totallinks = driver.findElements(By.tagName("a"));
	
	System.out.println(totallinks.size());
System.out.println("-------------------------for loop--------------------------"); 
	for(int i=1;i<=totallinks.size()-1;i++) {
		
		System.out.println(totallinks.get(i).getText());
	}
	System.out.println("-------------------------for each loop--------------------------"); 
	for(WebElement t:totallinks) {
		System.out.println(t.getText());
	}
	System.out.println("-------------------------for iterator--------------------------"); 
	Iterator<WebElement> r = totallinks.iterator();
	while(r.hasNext()) {
		//System.out.println(r.next());
		String text = r.next().getText();
		System.out.println(text);
	}
	
	System.out.println("-------------------------list iterator--------------------------------");
	ListIterator<WebElement> lr = totallinks.listIterator();
	while(lr.hasNext()) {
		System.out.println(lr.next());
	}

}
}
