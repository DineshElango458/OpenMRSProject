package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class UploadPage extends BaseClass {



	public UploadPage() {

		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[9]/div[1]/div[1]/div[3]/div[1]/div[2]/a[5]")
	private WebElement attachment;


	public WebElement getAttachment() {
		return attachment;
	}


	public void attachment() {
		elementclick(attachment);
	}


}
