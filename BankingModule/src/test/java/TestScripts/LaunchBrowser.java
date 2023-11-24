package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchBrowser 
{
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
	}
}
