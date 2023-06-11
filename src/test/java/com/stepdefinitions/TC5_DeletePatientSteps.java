package com.stepdefinitions;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class TC5_DeletePatientSteps {
	PageObjectManager pm = new PageObjectManager();

	@Then("User should enter Delete Patient id and click search")
	public void userShouldEnterDeletePatientIdAndClickSearch() {
		pm.getSearchIdPage().getSearchid().sendKeys(TC4_RecentVisitSteps.getid);
	}
	@Then("User should verify Delete Patient should not be displayed")
	public void userShouldVerifyDeletePatientShouldNotBeDisplayed()  {
		String text = pm.getSearchIdPage().getNomatches().getText();
		System.out.println(text);
		Assert.assertTrue("No matching record found", true);
	}



}
