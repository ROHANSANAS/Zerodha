package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	
	public static String  getData(int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\java\\Kite.Zerotha\\src\\main\\resources\\Zerodha.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
	System.out.println(value);
return value;
		
		
	}

}
