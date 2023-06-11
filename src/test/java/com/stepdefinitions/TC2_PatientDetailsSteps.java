package com.stepdefinitions;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_PatientDetailsSteps extends BaseClass {
	PageObjectManager pm = new PageObjectManager();


	@When("User should enter valid details of Demographics ,gender,birthdate,addressfield and phone number {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldEnterValidDetailsOfDemographicsGenderBirthdateAddressfieldAndPhoneNumberAnd(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13) {
		pm.getPatientPage().names(string, string2);
		pm.getPatientPage().namebtn();
		pm.getPatientPage().gender(string3);
		pm.getPatientPage().genderbtn();
		pm.getPatientPage().birthDetails(string4);
		pm.getPatientPage().birthmonth(string5);
		pm.getPatientPage().birthYear(string6);
		pm.getPatientPage().birthbtn();
		pm.getPatientPage().adressDetails(string7, string8, string9, string10, string11, string12);
		pm.getPatientPage().addbtn();
		pm.getPatientPage().phno(string13);
		pm.getPatientPage().phbtn();
	}
	@When("User should click relationships details")
	public void userShouldClickRelationshipsDetails() {
		pm.getPatientPage().relativebtn();
	}
	@When("User should verify confirm page all details")
	public void userShouldVerifyConfirmPageAllDetails() {
		WebElement all = findlocatorbyxpath("//div[@id='dataCanvas']");
		String text2 = all.getText();
		System.out.println(text2);
		
	}
	@Then("User should click confirm and verify patient details page redirected")
	public void userShouldClickConfirmAndVerifyPatientDetailsPageRedirected() throws InterruptedException {
		System.out.println("end");
		pm.getPatientPage().confirmpgbtn();
	}





}
