package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class FileUploadPage extends BaseClass {



	public FileUploadPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id="visit-documents-dropzone")
	private WebElement addfile;
	@FindBy(xpath="//textarea[@placeholder='Enter a caption']")
	private WebElement caption;
	@FindBy(xpath=" //button[@class='confirm ng-binding']")
	private WebElement uploadbtn;
	@FindBy(xpath=" //span[@class='PersonName-givenName']")
	private WebElement nextpg;


	public WebElement getAddfile() {
		return addfile;
	}
	public WebElement getCaption() {
		return caption;
	}
	public WebElement getUploadbtn() {
		return uploadbtn;
	}
	public WebElement getNextpg() {
		return nextpg;
	}

	public void addfile() {
		elementclick(addfile);
	}

	public void caption(String data) {
		elementsendkeys(getCaption(), data);
	}

	public void uploadbtn() {
		elementclick(uploadbtn);
	}


	public void nxtpgbtn() {
		elementclick(nextpg);
	}





}
