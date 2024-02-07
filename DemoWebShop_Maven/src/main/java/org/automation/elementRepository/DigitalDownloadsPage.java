package org.automation.elementRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadsPage{

	@FindBy(xpath = "//input[@value='Add to cart']")
	private List<WebElement> addToCartButton;

	@FindBy(xpath = "(//a[text()='3rd Album'])[2]")
	private WebElement firstProdName;

	@FindBy(xpath = "(//h2[@class='product-title']//a[text()='Music 2'])[1]")
	private WebElement secondProdName;

	@FindBy(xpath = "(//h2[@class='product-title']//a[text()='Music 2'])[1]")
	private WebElement thirdProdName;

	//Constructor
	public DigitalDownloadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//getters method
	public List<WebElement> getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getFirstProdName() {
		return firstProdName;
	}

	public WebElement getSecondProdName() {
		return secondProdName;
	}

	public WebElement getThirdProdName() {
		return thirdProdName;
	}
}
