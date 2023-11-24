package test_scrpts;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_lib.Base_test;


public class Test_Case_001 extends Base_test  {
@Test
public void loginscrpt()
{
	driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	takescreenshot();
}
	
}
