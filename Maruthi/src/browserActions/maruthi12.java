package browserActions;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class maruthi12 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.switchTo().newWindow(WindowType.TAB);
	}
}
