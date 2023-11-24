package pomconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testscript
{
	WebDriver driver;
   @Test
   public void manu()
   {
	   System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/"); 
		pom s1 = new pom(driver);
		s1.textfild1("maruthi");
   }
   }
