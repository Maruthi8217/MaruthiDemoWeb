package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file12 
{
public static void main(String[] args) throws IOException {
	File f1=new File("sample.txt");
	if (!f1.exists()) 
	{
	f1.createNewFile();	
	System.out.println("new file created");
	}
	else 
	{
          System.out.println("file is alredy exist");
	}
	
	
	/*FileOutputStream f2=new FileOutputStream(f1);
	String msg="I'm from banglore\n";
	f2.write(msg.getBytes());
	String msg1="I'm from ty";
	f2.write(msg1.getBytes());*/
	FileInputStream fis=new FileInputStream(f1);
	int i = fis.read();
	while(i!=-1)
	{
	System.out.print((char)i);
	i=fis.read();
	}
	
	
	
}
}



//it is used to create the file ------>file handling