package CommonMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Utility {
	// excelData
	// screenSHot
	// click
	// scroll
	// wait-->implicit
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);		
		WebElement element=driver.findElement(By.className("sc-aXZVg gIWfoE"));

		scrollIntoView(driver, element);
		Thread.sleep(2000);
			clickOnElement(driver, element);
			Thread.sleep(2000);
		takeScreenShot(driver, "komalll");
		}
	
	public static void scrollIntoView(WebDriver driver, WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	public static void takeScreenShot(WebDriver driver, String fileName) throws IOException {

	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Dell\\Downloads\\Komal\\seleniumscreenshot\\" + fileName + ".png");
	FileHandler.copy(src, dest);
	}
	public static String readDataFromExcel(String filePath, String sheetName, int rowNum, int cellNum)throws EncryptedDocumentException, IOException {
	FileInputStream myFile = new FileInputStream(filePath);
	String value =WorkbookFactory.create(myFile).getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();

	return value;
	}
	public static void clickOnElement(WebDriver driver, WebElement element) {
	scrollIntoView(driver, element);
	}
	}
