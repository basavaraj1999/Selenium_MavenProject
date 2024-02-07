package org.automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	@FindBy(partialLinkText = "Shopping")
	private WebElement shoppingCartLink;

	@FindBy(partialLinkText = "Wishlist")
	private WebElement wishlistLink;

	@FindBy(linkText = "Log out")
	private WebElement logoutLink;

	@FindBy(xpath = "(//a[contains(text(),'Digital downloads')])[1]")
	private WebElement ditalDownloadsLink;

	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Books')]")
	private WebElement booksLink;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getDitalDownloadsLink() {
		return ditalDownloadsLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}
}
