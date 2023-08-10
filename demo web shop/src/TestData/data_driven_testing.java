package TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class data_driven_testing 
{
	public static void main(String[] args) 
	{

	}

	public static Object[][] demo_Web_shop() throws EncryptedDocumentException, IOException
	{
		File file=new File("./excel/TestData.xlsx");

		FileInputStream fls=new FileInputStream(file);

		Workbook book=WorkbookFactory.create(fls);

		Sheet sheet=book.getSheet("Demo_web_shop_register_data");

		int row = sheet.getPhysicalNumberOfRows();

		int cell = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] data=new Object[row-1][cell];
		
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < cell; j++) 
			{
               data[row-1][cell]=sheet.getRow(i).getCell(j).toString();
			}	
		}
		
		return data;













	}
}
