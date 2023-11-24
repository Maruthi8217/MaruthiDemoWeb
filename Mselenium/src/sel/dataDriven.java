package sel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class dataDriven 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	dataDriven g1 = new dataDriven();
	g1.generic("sheet1", 0, 0);
}

public void generic(String s2,int r2, int c2) throws EncryptedDocumentException, IOException
{
FileInputStream f1 = new FileInputStream("./excel/Book1.xlsx");
	
	Workbook loc = WorkbookFactory.create(f1);
	
	Sheet s1 = loc.getSheet(s2);
	
	Row r1 = s1.getRow(r2);
	
	Cell c1 = r1.getCell(c2);
	
	String value = c1.getStringCellValue();
	
	System.out.println(value);
}
}



