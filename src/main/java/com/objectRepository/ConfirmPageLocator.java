package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class ConfirmPageLocator extends BaseClass {
	public ConfirmPageLocator() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement txtOrderNo;
	@FindBy(id = "my_itinerary")
	private WebElement btnMyIter;
	@FindBy(id = "check_all")
	private WebElement btnCheckAll;
	@FindBy(name = "cancelall")
	private WebElement btnCancel;
	@FindBy(name = "logout")
	private WebElement btnLogout;

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}

	public WebElement getBtnMyIter() {
		return btnMyIter;
	}

	public WebElement getBtnCheckAll() {
		return btnCheckAll;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getBtnLogout() {
		return btnLogout;
	}
}
