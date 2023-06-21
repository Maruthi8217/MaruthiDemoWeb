package com.automation_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_Test
{
	@Test(dataProvider = "login")
	public void login(String email,String pswd)
	{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("//a[text()='Log in']")).click();

		driver.findElement(By.id("Email")).sendKeys(email);

		driver.findElement(By.id("Password")).sendKeys(pswd);

		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();

	}

	@DataProvider(name = "login")
	public Object[][] login_data()
	{
		Object[][] data=new Object[1][2];

		data[0][0]="deekshithp97399@gmail.com";

		data[0][1]="R18me827@";

		return data;
	}
}
