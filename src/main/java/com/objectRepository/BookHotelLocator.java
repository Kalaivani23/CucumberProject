package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class BookHotelLocator extends BaseClass {
	public BookHotelLocator() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement txtFirstName;
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	@FindBy(id = "address")
	private WebElement txtAddress;
	@FindBy(id = "cc_num")
	private WebElement txtCreditCard;
	@FindBy(id = "cc_type")
	private WebElement txtCardType;
	@FindBy(id = "cc_exp_month")
	private WebElement txtCardExpMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement txtCardExpYear;
	@FindBy(id = "cc_cvv")
	private WebElement txtCreditCCV;
	@FindBy(id = "book_now")
	private WebElement btnBookNow;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCard() {
		return txtCreditCard;
	}

	public WebElement getTxtCardType() {
		return txtCardType;
	}

	public WebElement getTxtCardExpMonth() {
		return txtCardExpMonth;
	}

	public WebElement getTxtCardExpYear() {
		return txtCardExpYear;
	}

	public WebElement getTxtCreditCCV() {
		return txtCreditCCV;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

}
