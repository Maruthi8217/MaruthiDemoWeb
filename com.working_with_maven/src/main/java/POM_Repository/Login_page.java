package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page
{
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(partialLinkText = "Log in")
	private WebElement login_link;

	public void login_link()
	{
		login_link.click();
	}

	public WebElement getLogin_link()
	{
		return login_link;
	}

	public void setLogin_link(WebElement login_link)
	{
		this.login_link = login_link;
	}

	@FindBy(id = "Email")
	private WebElement email_text_field;

	public void enter_mail_id(String email)
	{
		email_text_field.sendKeys(email);
	}

	@FindBy(id = "Password")
	private WebElement PasswordTextField;

	public void enter_password(String password)
	{
		PasswordTextField.sendKeys(password);
	}
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement LoginButton;
	
	public WebElement getEmail_text_field() {
		return email_text_field;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public void ClickOnLoginButton()
	{
		LoginButton.click();
	}



}
