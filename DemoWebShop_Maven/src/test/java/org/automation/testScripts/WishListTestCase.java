package org.automation.testScripts;

import org.automation.elementRepository.BooksPage;
import org.automation.elementRepository.FictionEXPage;
import org.automation.elementRepository.WishListPage;
import org.automation.genericLibrary.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WishListTestCase extends BaseTest{

	@Test
	public void addToWishlistTestCase() {

		//Clicking on Books Link
		hm_pg.getBooksLink().click();

		//Verifying Books page is displayed or not by Title of the page.
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "books page not displayed");
		Reporter.log("Books page displayed", true);

		//Creating an object of BooksPage
		BooksPage books_Page=new BooksPage(driver);

		//Clicking on FictionEX Book product
		books_Page.getFictionEXBook().click();

		//Creating an object of FictionEXPage
		FictionEXPage ex_Pg=new FictionEXPage(driver);

		//Fetching the product name text
		Assert.assertEquals("Fiction EX" , ex_Pg.getProductName().getText(), "Product not added to wishlist");
		Reporter.log("Product added to wishlist");

		//Clicking on wish list button
		ex_Pg.getAddToWishlistButton().click();

		//Verifying product added to the wish list or not
		Assert.assertEquals(ex_Pg.getAddedToWishlistMessage().isDisplayed(), true, "Product not added");
		Reporter.log("Product added successfully",true);

		//Clicking on wish list link
		hm_pg.getWishlistLink().click();

		//Verifying wish list page is displayed or not by URL of the page.
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/wishlist", "wishlist page not displayed");
		Reporter.log("Wishlist page is displayed" , true);

		//Creating an object of WishListPage
		WishListPage wslst_page=new WishListPage(driver);

		//Removing product from the wish list
		wslst_page.getRemoveFromWishlistCheckbox().click();
		wslst_page.getUpdateWishlist().click();

		//Verifying the wish list is empty or not.
		Assert.assertEquals(wslst_page.getEmptyWishlistMessage().isDisplayed(), true, "Product not removed from wishlist");
		Reporter.log("Product removed from wishlist",true);
	}	
}

