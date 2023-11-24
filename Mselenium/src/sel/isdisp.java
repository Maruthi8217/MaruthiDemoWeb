package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisp
{
public static void main(String[] args) 
{
	 System.setProperty("webdriver.chrom.driver","./software/chromedriver.exe");
	 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
			
		boolean b = ele.isDisplayed();
		if (b) 
		{
		System.out.println("element is displying");	
		}
		else
		{
			System.out.println("no");
		}
}
}
