package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\Dell\\eclipse\\java-2024-03\\eclipse\\EXCEL\\test1.xlsx");
		
		//double text1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		//System.out.println(text1);
		
		String text = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
		System.out.println(text);
	
	//boolean text2 = WorkbookFactory.create(myfile).getSheet("Sheet3").getRow(4).getCell(1).getBooleanCellValue();
//	System.out.println(text2);
	}

}
