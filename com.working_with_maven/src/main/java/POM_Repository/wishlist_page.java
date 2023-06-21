package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wishlist_page
{
	public wishlist_page(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement WishlistLink;

	public void wishlistlink()
	{
		WishlistLink.click();
	}

	public WebElement getWishlistLink()
	{
		return WishlistLink;
	}

	public void setWishlistLink(WebElement wishlistLink) 
	{
		WishlistLink = wishlistLink;
	}


}
