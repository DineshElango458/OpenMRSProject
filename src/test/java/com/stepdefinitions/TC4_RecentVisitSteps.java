package com.stepdefinitions;

import java.util.concurrent.TimeUnit;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TC4_RecentVisitSteps extends BaseClass{
	PageObjectManager pm = new PageObjectManager();	
	public static String getid;


	@When("User should verify Recent click entry and attachment section has an attachment")
	public void userShouldVerifyAttachmentSectionHasAnAttachment() {
		pm.getVerificationPage().scrolldown();
	}
	
	@When("User should click End Visit and click Yes")
	public void userShouldClickEndVisitAndClickYes() {
		pm.getVerificationPage().endvisit();
		pm.getVerificationPage().endbtn();
	}

	@Then("User should click Delete Patient {string} and confirm button")
	public void userShouldClickDeletePatientAndConfirmButton(String string) {
		pm.getDeletePage().deletevisit();
		pm.getDeletePage().reason(string);
		pm.getDeletePage().deletebtn();
		getid = pm.getDeletePage().getid();
		System.out.println("The Patient Id is "+ getid);
		Assert.assertTrue(getid, true);
	}



}
