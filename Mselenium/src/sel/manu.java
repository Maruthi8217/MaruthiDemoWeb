package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class manu 
{
 public WebDriver driver;
@BeforeMethod
public void open()
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
}

@AfterMethod
public void close() throws InterruptedException
{
	Thread.sleep(2000);
   driver.close();	
}
}
