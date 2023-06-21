package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping_cart_page
{
	public Shopping_cart_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement ShoppingCartLink;

	public void shoppingcart()
	{
		ShoppingCartLink.click();
	}

	public WebElement getShoppingCartLink() {
		return ShoppingCartLink;
	}

	public void setShoppingCartLink(WebElement shoppingCartLink) {
		ShoppingCartLink = shoppingCartLink;
	}
}
