package sel;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.batik.util.ClassFileUtilities;
import org.apache.commons.compress.utils.FileNameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sanmplw {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manu@#$%^");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	 
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 
	 File pic = new File("./photo/a1.png");
	 
	// ClassFileUtilities.copy(src,pic);
	 
	 //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
            WebDriverWait wait = new WebDriverWait(driver,null);
            
            wait.until(ExpectedConditions.titleContains("enter"));
            
            
            
            
	 
	 
	
	 
	 
	
	
}
}
