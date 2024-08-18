package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\Dell\\eclipse\\java-2024-03\\eclipse\\EXCEL\\test1.xlsx");
		
		
		String text = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(2).getCell(1).getStringCellValue();
				System.out.println(text);
				
		
	}
}
