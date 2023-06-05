package com.pages;

import com.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class VerificationPage extends BaseClass{



	public VerificationPage() {

		PageFactory.initElements(driver, this);
	}




	@FindBy(xpath="//h3[text()='ATTACHMENTS']")
	private WebElement attachments;


	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[9]/div[3]/div[1]/ul[1]/li[1]/a[1]/div[1]/div[2]")
	private WebElement endvisit;

	@FindBy(xpath="(//button[text()='Yes'])[2]")
	private WebElement endbtn;


	public WebElement getAttachments() {
		return attachments;
	}

	public WebElement getEndvisit() {
		return endvisit;
	}

	public WebElement getEndbtn() {
		return endbtn;
	}




	public void endvisit() {
		elementclick(endvisit);
	}

	public void endbtn() {
		elementclick(endbtn);
	}

	public void scrolldown() {
		javascriptscrolldown(getAttachments());
	}

}
