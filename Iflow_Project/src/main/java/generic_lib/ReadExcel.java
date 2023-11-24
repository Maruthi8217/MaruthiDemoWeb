package generic_lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadExcel
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file=new File("./src/test/resources/testdata/Demowebshop_Login_testdata.xlsx");
        FileInputStream fls = new FileInputStream(file);
        
	}



}
