package CommonMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility1 {
	// excelData
	// screenSHot
	// click
	// scroll
	// wait-->implicit
    //ScrollInView
	public static void ScrollIntoView(WebDriver driver, WebElement element) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	//Screenshot
	public static void Screenshot(WebDriver driver, String filename) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Dell\\Downloads\\Komal\\seleniumscreenshot\\"+filename+".png");
	FileHandler.copy(src, dest);
		
	}
	
	
	//read data from excel sheet
	public static String ReadDataFromExcel(String filepath, String sheetName, int rowNum, int CellNum) throws EncryptedDocumentException, IOException{
FileInputStream myfile = new FileInputStream(filepath);
String value = WorkbookFactory.create(myfile).getSheet(sheetName).getRow(rowNum).getCell(CellNum).getStringCellValue();
return value;		
		
	}

    public static void clickOnElement(WebDriver driver, WebElement element)
    {
    	ScrollIntoView(driver, element);
    }





}
