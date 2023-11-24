package sel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class test extends manu
{
 @Test
 public void login()
 {
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123wqd");
	 
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("as123");
	 
	 driver.findElement(By.xpath("//input[@type='button']")).click();
	 
	 
 }
}
