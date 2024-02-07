package org.automation.testScripts;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.automation.elementRepository.DigitalDownloadsPage;
import org.automation.elementRepository.ShoppingCartPage;
import org.automation.genericLibrary.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(org.automation.genericLibrary.ListenersImplementation.class)
public class AddToCartAndRemoveFromCartTestCase extends  BaseTest{

	@Test
	public void addToCartAndRemoveFromCart() throws EncryptedDocumentException, IOException, InterruptedException
	{

		//Creating objects for their respective pages
		DigitalDownloadsPage d_d = new DigitalDownloadsPage(driver);
		ShoppingCartPage sc = new ShoppingCartPage(driver);

		//To click on Digital downloads link
		hm_pg.getDitalDownloadsLink().click();

		//Verifying Digital downloads page is displayed or not
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/digital-downloads","Digital downloads pg is not displayed");
		Reporter.log("Digital downloads page is displayed",true);

		//To click on add to cart button for all the products that are present in the Digital downloads
		List<WebElement> clickCart = d_d.getAddToCartButton();
		for (WebElement addToCart : clickCart) 
		{
			Thread.sleep(1500);
			addToCart.click();
		}

		//To click on the shopping cart link
		hm_pg.getShoppingCartLink().click();
		Thread.sleep(2000);

		//Verifying the added products are displayed in the shopping cart or not.
		Assert.assertEquals(d_d.getFirstProdName().getText(), "3rd Album");
		Reporter.log("3rd Album is added to the cart successfully",true);

		//		Assert.assertEquals(d_d.getSecondProdName().getText(), "Music 2");
		//		Reporter.log("Music 2 is added to the cart successfully",true);
		//
		//		Assert.assertEquals(d_d.getThirdProdName().getText(), "Music 2");
		//		Reporter.log("Music 2 is added to the cart successfully",true);

		//To remove the added products from shopping cart
		List<WebElement> removeProdCheckBox = sc.getRemoveFromCartCheckBox();
		for (WebElement removeCB : removeProdCheckBox) {
			Thread.sleep(1500);
			removeCB.click();
		}
		sc.getUpdateCartButton().click();

		//Verifying the shopping cart is empty or not
		boolean EmptyCartCnfrmMsg = sc.getUpdateCartmessage().isDisplayed();
		Assert.assertEquals(EmptyCartCnfrmMsg,true);
		Reporter.log("All the products are removed from the cart successfully",true);
	}
}
