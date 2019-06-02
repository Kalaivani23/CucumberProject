package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class SearchPageLocator extends BaseClass {
	public SearchPageLocator() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement txtLocation;
	@FindBy(id = "hotels")
	private WebElement txtHotels;
	@FindBy(id = "room_type")
	private WebElement txtRoomType;
	@FindBy(id = "room_nos")
	private WebElement txtRoomNo;
	@FindBy(id = "datepick_in")
	private WebElement txtDateIn;
	@FindBy(id = "datepick_out")
	private WebElement txtDateOut;
	@FindBy(id = "adult_room")
	private WebElement txtAdtRoom;
	@FindBy(id = "child_room")
	private WebElement txtChdRoom;
	@FindBy(id = "Submit")
	private WebElement btnSubmit;
	@FindBy(id = "radiobutton_0")
	private WebElement btnHotelSel;
	@FindBy(id = "continue")
	private WebElement btnContinue;

	public WebElement getBtnHotelSel() {
		return btnHotelSel;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTxtLocation() {
		return txtLocation;
	}

	public WebElement getTxtHotels() {
		return txtHotels;
	}

	public WebElement getTxtRoomType() {
		return txtRoomType;
	}

	public WebElement getTxtRoomNo() {
		return txtRoomNo;
	}

	public WebElement getTxtDateIn() {
		return txtDateIn;
	}

	public WebElement getTxtDateOut() {
		return txtDateOut;
	}

	public WebElement getTxtAdtRoom() {
		return txtAdtRoom;
	}

	public WebElement getTxtChdRoom() {
		return txtChdRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
}
