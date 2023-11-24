package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class maruthi 
{
   @Test
   public void script() 
   {
	 System.setProperty("webdriver.chrom.driver","./software/chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	
	pom s1 = new pom(driver);
	
	
   }
}
