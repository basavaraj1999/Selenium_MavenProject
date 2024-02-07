package org.automation.elementRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	@FindBy(xpath = "//input[@name='removefromcart']")
	private List<WebElement> removeFromCartCheckBox;

	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement updateCartButton;

	@FindBy(xpath = "//div[@class='order-summary-content']")
	private WebElement updateCartmessage;

	//Constructor
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//getters method
	public List<WebElement> getRemoveFromCartCheckBox() {
		return removeFromCartCheckBox;
	}

	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}

	public WebElement getUpdateCartmessage() {
		return updateCartmessage;
	}


}
