package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PatientPage extends BaseClass {

	public PatientPage() {

		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//input[@name='givenName']")
	private WebElement given;
	@FindBy(xpath="//input[@name='familyName']")
	private WebElement familyname;
	@FindBy(id="next-button")
	private WebElement button;
	@FindBy(xpath= "//select[@id='gender-field']")
	private WebElement gender;
	@FindBy(xpath="//button[@class='confirm right']")
	private WebElement genderbtn;
	@FindBy(xpath="//input[@id='birthdateDay-field']")
	private WebElement day;
	@FindBy(xpath="//select[@id='birthdateMonth-field']")
	private WebElement month;
	@FindBy(xpath="//input[@id='birthdateYear-field']")
	private WebElement year;
	@FindBy(id="next-button")
	private WebElement birthbtn;
	@FindBy(xpath="(//input[@type='text'])[8]")  //input[@class='focused']
	private WebElement address1;
	@FindBy(xpath="(//input[@type='text'])[9]")
	private WebElement address2;
	@FindBy(xpath="(//input[@type='text'])[10]")
	private WebElement city;
	@FindBy(xpath="(//input[@type='text'])[11]")
	private WebElement  state;
	@FindBy(xpath="(//input[@type='text'])[12]")
	private WebElement  country;
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement  postalCode;
	@FindBy(id="next-button")
	private WebElement  addressbtn;
	@FindBy(xpath="//input[@name='phoneNumber']")
	private WebElement  phnumber;
	@FindBy(id="next-button")
	private WebElement  phbtn;
	@FindBy(id="next-button")
	private WebElement  relativebtn;
	@FindBy(xpath="//div[@id='dataCanvas']")
	private WebElement confirmName;
	@FindBy(xpath="//span[text()='Gender: ']")
	private WebElement confirmgender;
	@FindBy(xpath= "//span[text()='Birthdate: ']")
	private WebElement confirmbirth;
	@FindBy(xpath="//span[text()='Address: ']")
	private WebElement confirmaddress;
	@FindBy(xpath="//span[text()='Phone Number: ']")
	private WebElement confirmphno;

	@FindBy(id="submit")
	private WebElement confirmpgbtn;



	public WebElement getGiven() {
		return given;
	}
	public WebElement getFamilyname() {
		return familyname;
	}
	public WebElement getButton() {
		return button;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getGenderbtn() {
		return genderbtn;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getBirthbtn() {
		return birthbtn;
	}
	public WebElement getAddress1() {
		return address1;
	}
	public WebElement getAddress2() {
		return address2;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getPostalCode() {
		return postalCode;
	}
	public WebElement getAddressbtn() {
		return addressbtn;
	}
	public WebElement getPhnumber() {
		return phnumber;
	}
	public WebElement getPhbtn() {
		return phbtn;
	}
	public WebElement getRelativebtn() {
		return relativebtn;
	}


		public WebElement getConfirmName() {
		return confirmName;
	}
	public WebElement getConfirmgender() {
		return confirmgender;
	}
	public WebElement getConfirmbirth() {
		return confirmbirth;
	}
	public WebElement getConfirmaddress() {
		return confirmaddress;
	}
	public WebElement getConfirmphno() {
		return confirmphno;
	}
	 	public WebElement getConfirmpgbtn() {
		 return confirmpgbtn;

	 }
	 public void  names(String name,String familyname) {
		 elementsendkeys(getGiven(), name);
		 elementsendkeys(getFamilyname(), familyname);

	 }
	 public void namebtn() {
		 elementclick(button);
	 }


	 public void gender(String text) {
		 selectoptionbytext(getGender(), text);
	 }

	 public  void genderbtn   () {
		 elementclick(genderbtn);
	 }


	 public void birthDetails(String day) {
		 elementsendkeys(getDay(), day);

	 }

	 public void birthmonth(String month) {
		 selectoptionbytext(getMonth(), month);
	 }

	 public void birthYear(String day) {
		 elementsendkeys(getYear(), day);

	 }

	 public  void birthbtn() {
		 elementclick(birthbtn);

	 }

	 public void adressDetails(String add1,String add2, String city, String state, String country, String postal) {
		 elementsendkeys(getAddress1(), add1);
		 elementsendkeys(getAddress2(), add2);
		 elementsendkeys(getCity(), city);
		 elementsendkeys(getState(), state);
		 elementsendkeys(getCountry(), country);
		 elementsendkeys(getPostalCode(), postal);
	 }
	 public void addbtn() {
		 elementclick(addressbtn);
	 }

	 public void phno(String data) {
		 elementsendkeys(getPhnumber(), data);
	 }

	 public void phbtn() {
		 elementclick(phbtn);
	 }

	 public void relativebtn() {
		 elementclick(relativebtn);
	 }

	 /*public void confirmDetails() {
		elementgetattributevalue(getConfirmName());
		elementgetattributevalue(getConfirmgender());
		elementgetattributevalue(getConfirmbirth());
		elementgetattributevalue(getConfirmaddress());
		elementgetattributevalue(getConfirmphno());
	}*/
	 public void confirmpgbtn() {
		 elementclick(confirmpgbtn);
	 }








}
