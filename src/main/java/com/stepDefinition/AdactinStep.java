package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import com.objectRepository.BookHotelLocator;
import com.objectRepository.ConfirmPageLocator;
import com.objectRepository.LoginPageLocator;
import com.objectRepository.SearchPageLocator;
import com.resources.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AdactinStep extends BaseClass {

	@Given("^User verify the url and title$")
	public void user_verify_the_url_and_title() {
		if (getURL().contains("adactin")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (getTitle().contains("Hotel")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	@Given("^User login the adactin page \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_the_adactin_page_and(String user, String pass) {
		LoginPageLocator l = new LoginPageLocator();
		type(l.getTxtUserName(), user);
		type(l.getTxtPassWord(), pass);
		click(l.getBtnLogin());

	}

	@Given("^User enter the details in search hotel page \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_details_in_search_hotel_page_and(String location, String hotel, String roomtype,
			String numrooms, String checkin, String checkout, String adtcount, String chdcount)
			throws InterruptedException {
		SearchPageLocator s = new SearchPageLocator();
		dropDownText(s.getTxtLocation(), location);
		dropDownText(s.getTxtHotels(), hotel);
		dropDownText(s.getTxtRoomType(), roomtype);
		dropDownText(s.getTxtRoomNo(), numrooms);
		type(s.getTxtDateIn(), checkin);
		type(s.getTxtDateOut(), checkout);
		dropDownText(s.getTxtAdtRoom(), adtcount);
		dropDownText(s.getTxtChdRoom(), chdcount);
		click(s.getBtnSubmit());
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		click(s.getBtnHotelSel());
		click(s.getBtnContinue());
	}

	@When("^User enter the details in booking hotel page \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_details_in_booking_hotel_page_and(String firstname, String lastname, String address,
			String cardno, String cardtype, String expmonth, String expyear, String ccv) throws InterruptedException {
		BookHotelLocator b = new BookHotelLocator();
		type(b.getTxtFirstName(), firstname);
		type(b.getTxtLastName(), lastname);
		type(b.getTxtAddress(), address);
		type(b.getTxtCreditCard(), cardno);
		dropDownText(b.getTxtCardType(), cardtype);
		dropDownText(b.getTxtCardExpMonth(), expmonth);
		dropDownText(b.getTxtCardExpYear(), expyear);
		type(b.getTxtCreditCCV(), ccv);
		click(b.getBtnBookNow());
		Thread.sleep(10000);
		ConfirmPageLocator c = new ConfirmPageLocator();
		String orderid = c.getTxtOrderNo().getAttribute("value");
		System.out.println("Order Id: " + orderid);
		click(c.getBtnMyIter());
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		click(c.getBtnCheckAll());
		click(c.getBtnCancel());
		alert("Confirm", "accept");
		click(c.getBtnLogout());
	}
}
