package generic_lib;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test extends UtiltyMethods {
	@BeforeMethod
	public void launchbrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(Base_url);
	}
	@AfterMethod
	public void closebrowser() 
	{
		takescreenshot();
		driver.close();  
	}
}
