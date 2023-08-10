package com.generic_libriers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BrowserSetUp 
{
	public WebDriver driver;
	@BeforeClass
	public void Browserup_and_run()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
	}

	@AfterClass
	public void BorwserTear()
	{
		driver.close();
	}
}