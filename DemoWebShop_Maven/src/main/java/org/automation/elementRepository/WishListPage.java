package org.automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {

		@FindBy(xpath = "//input[@name='removefromcart']")
		private WebElement removeFromWishlistCheckbox;
		
		@FindBy(xpath = "//input[@name='updatecart']")
		private WebElement updateWishlist;
		
		@FindBy(xpath = "//div[@class='wishlist-content']")
		private WebElement emptyWishlistMessage;
		
		//Constructor
		public WishListPage(WebDriver driver){
			PageFactory.initElements(driver, this);
		}

		//getters
		public WebElement getRemoveFromWishlistCheckbox() {
			return removeFromWishlistCheckbox;
		}

		public WebElement getUpdateWishlist() {
			return updateWishlist;
		}

		public WebElement getEmptyWishlistMessage() {
			return emptyWishlistMessage;
		}	
	}
