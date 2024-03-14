package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis = new FileInputStream("./Data/testData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);//to make the file ready to ready
		
		Sheet sheet = wb.getSheet("ipl");//To get into the sheet
		Row row = sheet.getRow(11);
		Cell cell = row.createCell(0);
		cell.setCellValue("OWNER");
		
		FileOutputStream fos = new FileOutputStream("./Data/testData.xlsx");
		wb.write(fos);
		
		
		
		

	}

}

