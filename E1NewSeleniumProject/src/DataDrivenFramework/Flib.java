package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String excelPath,String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
		
		
        FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);//to make the file ready to ready
		Sheet sheet = wb.getSheet(sheetName);//To get into the sheet
		Row row = sheet.getRow(rowNo);//To get the desired row 
	    Cell cell = row.getCell(cellNo);//to get into desired cell/column
		String data = cell.getStringCellValue();//To read the data/value from the cell
		return data;
	    
	   }
	
		
		public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
		}
		
		public void writeExcelData(String excelPath,String sheetName, int rowNo,int cellNo, String data) throws EncryptedDocumentException, IOException
		{
	     FileInputStream fis = new FileInputStream(excelPath);
		 Workbook wb = WorkbookFactory.create(fis);//to make the file ready to ready
		 Sheet sheet = wb.getSheet(sheetName);//To get into the sheet
	     Row row = sheet.getRow(rowNo);//To get the desired row 
	     Cell cell=row.getCell(cellNo);
	     cell.setCellValue(data);
			    
		 FileOutputStream fos = new FileOutputStream(excelPath);
	     wb.write(fos);
			
			
		}
		

	}


