package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ConfirmPage extends BaseClass {


	public ConfirmPage() {

		PageFactory.initElements(driver, this);
	}



	@FindBy(linkText="Start Visit")      //	(//i[@class='icon-check-in'])[2]
	private WebElement startVisit;

	@FindBy(xpath="(//button[text()='Confirm'])[4]")
	private WebElement confirmStart;

	public WebElement getStartVisit() {
		return startVisit;
	}

	public WebElement getConfirmStart() {
		return confirmStart;
	}

	public void startVisit() {
		elementclick(startVisit);
	}

	public void confirmStart() {
		elementclick(confirmStart);
	}






}
