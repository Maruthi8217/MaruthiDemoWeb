package browserActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class chromebrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		for (int i = 0; i <10; i++)
		{
			driver.switchTo().newWindow(WindowType.TAB);
			if(i==2)
			{
				driver.get("https://www.selenium.dev/downloads/");
			}
		}//driver.get("https:www.google.com");
		
	}
}
