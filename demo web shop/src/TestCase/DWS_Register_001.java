package TestCase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseTest.BrowserSetUp;
import TestData.data_driven_testing;

public class DWS_Register_001 extends BrowserSetUp
{
	@Test(dataProvider = "Register_data")
	public void Register(String firstname,String lastname,String e)
	{
		driver.findElement(By.linkText("Register")).click();

		driver.findElement(By.id("gender-male")).click();

		driver.findElement(By.id("FirstName")).sendKeys("");

		driver.findElement(By.id("LastName")).sendKeys("");

		driver.findElement(By.id("Email")).sendKeys("");

		driver.findElement(By.id("Password")).sendKeys("");

		driver.findElement(By.id("ConfirmPassword")).sendKeys("");

		driver.findElement(By.id("register-button")).click();
	}
	
	@DataProvider(name = "Register_data")
	public Object[][] Register_data() throws EncryptedDocumentException, IOException
	{
		 return data_driven_testing.demo_Web_shop();
	}
	
	
	
}
