package org.automation.testScripts;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.automation.elementRepository.RegisterPage;
import org.automation.genericLibrary.BaseTest;
import org.automation.genericLibrary.DataUtility;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTestCase extends BaseTest {
	
	@Test(dataProvider = "RegisterCredentials" )
	public void registration(String firstName,String laststName,String email,String password,String confirmPassword) throws EncryptedDocumentException, IOException
	{

		//Creating an object
		RegisterPage rgstr = new RegisterPage(driver);
		Random r = new Random();

		//Clicking on logout button
		hm_pg.getLogoutLink().click();

		//Clicking on Register link
		hm_pg.getRegisterLink().click();

		//Verifying Registration page is displayed or not
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Register","Registrarion page not displayed");
		Reporter.log("Registrarion page displayed",true);

		//Filling all the details by using external files
		rgstr.getMaleRadioButton().click();
		rgstr.getFirstNameTextField().sendKeys(firstName);
		rgstr.getLirstNameTextField().sendKeys(laststName);
		rgstr.getEmailTextField().sendKeys(r.nextInt(5000)+email);
		rgstr.getPasswordTextField().sendKeys(password);
		rgstr.getConfirmPasswordTextField().sendKeys(confirmPassword);
		rgstr.getRegisterButton().click();

		//Verifying User is registered or not
		boolean cnfrmMsg = rgstr.getRegistrationConfirmationMessage().isDisplayed();
		Assert.assertEquals(cnfrmMsg,true);
		Reporter.log("User is Registered to Demo web shop Successfully",true);
	} 
	@DataProvider(name="RegisterCredentials")
	public Object[][] dataSupply() throws EncryptedDocumentException, IOException{
		return data_Utility.getMultipleDataFromExcel("RegisterTestData");
	}	
}
