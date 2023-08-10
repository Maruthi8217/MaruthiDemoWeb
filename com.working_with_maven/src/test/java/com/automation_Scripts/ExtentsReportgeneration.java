package com.automation_Scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentsReportgeneration 
{
	public static WebDriver driver;
	public static void main(String[] args)
	{
		ExtentReports reports=new ExtentReports("./Reports/newReport.html");
		ExtentTest test = reports.startTest("Login");
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		test.log(LogStatus.INFO,"Browser is opend");
		driver.get("https://demowebshop.tricentis.com/");
		test.log(LogStatus.INFO,"WelcomePage is displyed");
		driver.findElement(By.partialLinkText("Log")).click();
		test.log(LogStatus.INFO,"User clicked on login button");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("deekshithp97399@gmail.com");
		test.log(LogStatus.INFO,"User name is entered");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("R18me827@");
		test.log(LogStatus.INFO,"Password is entered");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		test.log(LogStatus.PASS,"User is loggedin");
		test.log(LogStatus.INFO,test.addScreenCapture(takesreenshot()));

		reports.endTest(test);
		reports.flush();
	}

	public static String takesreenshot()
	{
		String path="./screenshot/Login.png";
		TakesScreenshot ts= (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File fls=new File(path);
		try 
		{
			FileHandler.copy(temp, fls);
		} catch (IOException e)
		{
			
			e.printStackTrace();

		}
		return "."+path;
	}







}
