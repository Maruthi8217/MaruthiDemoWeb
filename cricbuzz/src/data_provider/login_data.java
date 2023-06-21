package data_provider;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class login_data {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		single("login");
	}

	public static void single(String sheet_name) throws EncryptedDocumentException, IOException
	{

		FileInputStream fls=new FileInputStream("./excel/TestData.xlsx");
		Workbook book=WorkbookFactory.create(fls);
		Sheet sheet=book.getSheet(sheet_name);
		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		for (int i = 1; i <row; i++)
		{
		 for (int j = 0; j < cell; j++)
		 {
		System.out.println(sheet.getRow(i).getCell(j));	
		}	
		}

	}
}
