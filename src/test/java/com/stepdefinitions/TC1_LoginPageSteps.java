package com.stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.hooks.Hooks;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginPageSteps extends BaseClass {
	PageObjectManager pm = new PageObjectManager();	


	@Given("User is on the Login page")
	public void user_is_on_the_login_page() throws FileNotFoundException, IOException {
		geturl(getPropertyFileValue("url"));
		maximizewindow();
	}
	@When("User should enter valid Username and Password")
	public void user_should_enter_valid_username_and_password() throws FileNotFoundException, IOException {	
		pm.getLoginPage().login();

	}
	@When("User should pick any location")
	public void user_should_pick_any_location() {
		pm.getLoginPage().laboratory();
	}
	@Then("User should click Login button and verify success msg")
	public void user_should_click_login_button_and_verify_success_msg() {
		pm.getLoginPage().loginbtn();
	}

	@Then("User is on the Dashboard page and click Register the  patient menu")
	public void userIsOnTheDashboardPageAndClickRegisterThePatientMenu() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(("CurrentPageUrl is "+ currentUrl));
		Assert.assertEquals("https://qa-refapp.openmrs.org/openmrs/referenceapplication/home.page", currentUrl);
		pm.getLoginPage().patientMenu();
	}
































}
