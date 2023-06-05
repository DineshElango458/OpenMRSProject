package com.pages;


import com.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SearchIdPage  extends BaseClass{


	public SearchIdPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@placeholder='Search by ID or Name']")
	private WebElement searchid;


	@FindBy(xpath="//td[text()='No matching records found']")
	private WebElement nomatches;


	public WebElement getSearchid() {
		return searchid;
	}


	public WebElement getNomatches() {
		return nomatches;
	}




}
