package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
FileInputStream myfile = new FileInputStream("C:\\Users\\Dell\\eclipse\\java-2024-03\\eclipse\\EXCEL\\test1.xlsx");	

	 Workbook work = WorkbookFactory.create(myfile);	
   Sheet text = work.getSheet("Sheet2");
      Row rows = text.getRow(1);
      Cell columns = rows.getCell(1);
      CellType data = columns.getCellType();
      System.out.println(data);
      String value = columns.getStringCellValue();
      System.out.println(value);
     
}
	}
