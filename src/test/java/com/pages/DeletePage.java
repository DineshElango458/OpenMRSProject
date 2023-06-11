package com.pages;


import com.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DeletePage extends BaseClass {

	public DeletePage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[6]/div[2]/div[1]/span[1]")
	private WebElement idvalue;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[9]/div[2]/div[1]/ul[1]/li[8]/a[1]/div[1]/div[2]")
	private WebElement deletevist;

	@FindBy(xpath="//input[@id='delete-reason']")
	private WebElement reason;

	@FindBy(xpath="(//button[@class='confirm right'])[6]")
	private WebElement deletbtn;


	public WebElement getIdvalue() {
		return idvalue;
	}


	public WebElement getDeletevist() {
		return deletevist;
	}


	public WebElement getReason() {
		return reason;
	}

	public WebElement getDeletbtn() {
		return deletbtn;
	}

	public void deletevisit() {
		elementclick(deletevist);
	}

	public void reason(String data) {
		elementsendkeys(getReason(), data);
	}

	public void deletebtn() {
		elementclick(deletbtn);
	}


	public String getid() {
		String id = elementgettext(getIdvalue());
		return id;

	}

}
