package sel;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom 
{
  WebDriver driver;
/*@FindBy(xpath = "//input[@type='text']")
private WebElement text;*/
	
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement textfield;
	
	
	
	public pom(WebDriver driver2) {
	PageFactory.initElements(driver2,this);
	}

	public void text()
	{
		textfield.sendKeys("manu");
	}
	




}