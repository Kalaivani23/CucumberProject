package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class LoginPageLocator extends BaseClass {
	public LoginPageLocator() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;
	@FindBy(id = "password")
	private WebElement txtPassWord;
	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
}
