package sel;

import static org.testng.Assert.assertEquals;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testng
{
public WebDriver driver;
@Test

public void manu()
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
    driver=new ChromeDriver();	
    driver.get("https://www.facebook.com/login/");
    
    String t1 = driver.getTitle();
    
    SoftAssert s1 = new SoftAssert();
    s1.assertEquals(t1, "hello");
    System.out.println("test cas pass");
    s1.assertAll();
    
}
}
