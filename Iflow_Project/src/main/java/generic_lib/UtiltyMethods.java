package generic_lib;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtiltyMethods implements FrameWork_constant
{
	public static WebDriver driver;
	
	public String takescreenshot()
	{
		String imagepath=screen_shot_path+name()+".png";
		TakesScreenshot ts = (TakesScreenshot)driver; 
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destnation = new File(imagepath);
		try
		{
			FileHandler.copy(src, destnation);
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return "."+imagepath;
	}

	public String name()
	{
		LocalDateTime sysdate = LocalDateTime.now();
		String name = sysdate.toString().replace(":", "-");
		return name;
	}
}
