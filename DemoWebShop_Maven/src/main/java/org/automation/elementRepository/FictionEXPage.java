package org.automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionEXPage {

	@FindBy(xpath = "//h1[@itemprop='name']")
	private WebElement productName;

	@FindBy(id = "add-to-wishlist-button-78")
	private WebElement addToWishlistButton;

		@FindBy(xpath = "//p[@class='content']")
		private WebElement addedToWishlistMessage;

	//constructor
	public FictionEXPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//getters
	public WebElement getProductName() {
		return productName;
	}

	public WebElement getAddToWishlistButton() {
		return addToWishlistButton;
	}

		public WebElement getAddedToWishlistMessage() {
			return addedToWishlistMessage;
		}
}

