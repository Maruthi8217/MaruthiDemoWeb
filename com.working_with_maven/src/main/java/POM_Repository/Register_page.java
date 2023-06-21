package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_page 
{

	public Register_page(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);	
	}

	@FindBy(partialLinkText = "Register")
	private WebElement RegisterLink;

	public void ClickOnRegisterLink()
	{
		RegisterLink.click();
	}

	@FindBy(id="gender-male")
	private WebElement GenderMaleRadioButton;

	public void MaleRadioButton()
	{
		GenderMaleRadioButton.click();
	}

	@FindBy(id = "gender-female")
	private WebElement GenderFemaleRadioButton;

	public void FemailRadioButton()
	{
		GenderFemaleRadioButton.click();
	}

	@FindBy(id="FirstName")
	private WebElement FirstNameTextField;

	public void firstnametext(String fname)
	{
		FirstNameTextField.sendKeys(fname);
	}

	@FindBy(id="LastName")
	private WebElement LastNameTextField;

	public void lastnametext(String lname)
	{
		LastNameTextField.sendKeys(lname);
	}

	@FindBy(xpath = "//input[@name='Email']")
	private WebElement EmailTextField;

	public void emailtextfield(String email)
	{
		EmailTextField.sendKeys(email);	
	}
	
	@FindBy(xpath = "//input[@name='Password']")
	private WebElement PasswordTextField;
	
	public void passwordtextfield(String password)
	{
		PasswordTextField.sendKeys(password);
	}

	@FindBy(xpath = "//input[@name='ConfirmPassword']")
	private WebElement ConformpasswordTextField;

	public void conformpasswordtextfield(String cpassword)
	{
		ConformpasswordTextField.sendKeys(cpassword);
	}
	
	@FindBy(xpath = "//input[@name='register-button']")
	 private WebElement RegisterButton;
	
	public void registerbutton()
	{
		RegisterButton.click();
	}

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getGenderMaleRadioButton() {
		return GenderMaleRadioButton;
	}

	public WebElement getGenderFemaleRadioButton() {
		return GenderFemaleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getConformpasswordTextField() {
		return ConformpasswordTextField;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	
}
