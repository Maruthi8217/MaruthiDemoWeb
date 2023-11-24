package pomconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom 
{
   @FindBy(xpath = "//input[@type='text']")
   WebElement textfield;
   
   public pom(WebDriver driver)
   {
	PageFactory.initElements(driver,this);   
   }
   
   public void textfild1(String un)
   {
	 textfield.sendKeys(un);  
   }
}


