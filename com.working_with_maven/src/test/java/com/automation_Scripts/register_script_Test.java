package com.automation_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class register_script_Test {
	@Test(dataProvider = "register_data")
	public void register(String fname,String lname,String email,String pswd,String cpswd)
	{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("//a[@contains(text(),'Register')]")).click();

		driver.findElement(By.id("gender-male")).click();

		driver.findElement(By.id("FirstName")).sendKeys(fname);

		driver.findElement(By.id("LastName")).sendKeys(lname);

		driver.findElement(By.id("Email")).sendKeys(email);

		driver.findElement(By.id("Password")).sendKeys(pswd);

		driver.findElement(By.id("ConfirmPassword")).sendKeys(cpswd);

		driver.findElement(By.id("register-button")).click();

	}

	@DataProvider(name="register_data")
	public Object[][] Demo_register()
	{
		Object[][] data=new Object[1][5];
		data[0][0]="maruthi";
		data[0][1]="dikshith";
		data[0][2]="deekshith8217@gmail.com";
		data[0][3]="82174564";
		data[0][4]="82174564";
		return data;
	}
}
