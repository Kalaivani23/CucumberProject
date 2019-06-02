package com.stepDefinition;

import com.resources.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void launch() {
		launchBrowser("http://adactin.com/HotelApp/index.php");
	}
	@After
	public void close() {
		closeBrowser();
	}
}
