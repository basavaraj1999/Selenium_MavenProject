package org.automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(name = "Password")
	private WebElement passwordTextField;

	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckBox;

	@FindBy(linkText = "Forgot password?")
	private WebElement forgotPasswordLink;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButtton;

	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}


	public WebElement getLoginButtton() {
		return loginButtton;


	}
}
