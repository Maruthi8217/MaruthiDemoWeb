package test_scrpts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_lib.Base_test;

public class DemoWebShop_LoginPage_001 extends Base_test {
@Test
public void loginPage()
{
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("deekshithp8217@gmail.com");

	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("R18me827@");
	
	driver.findElement(By.xpath("//input[@value='Log in']")).click();

}
}
