package com.pages;                                                                                                                       

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;                                                                                          

public class LoginPage extends BaseClass {                                                                                                                 


	public LoginPage() {                                                                                                                 

		PageFactory.initElements(driver,this); 

	}                                                     

	@FindBy(xpath="//input[@id='username']")                                                                                             
	private WebElement username;                                                                                                         
	@FindBy(xpath="//input[@id='password']")                                                                                             
	private WebElement password;                                                                                                         
	@FindBy(xpath="//li[@id='Laboratory']")                                                                                              
	private WebElement laboratory;                                                                                                       
	@FindBy(xpath="//input[@id='loginButton']")                                                                                          
	private WebElement loginbtn;    
	@FindBy(xpath="(//a[@type='button'])[3]")
	private WebElement registerPatient;

	public WebElement getUsername() {                                                                                                    
		return username;                                                                                                                 
	}                                                                                                                                    
	public WebElement getPassword() {                                                                                                    
		return password;                                                                                                                 
	}                                                                                                                                    
	public WebElement getLaboratory() {                                                                                                  
		return laboratory;                                                                                                               
	}                                                                                                                                    
	public WebElement getLoginbtn() {                                                                                                    
		return loginbtn;                                                                                                                 
	}                                                                                                                                    
	public WebElement getRegisterPatient() {
		return registerPatient;
	}                  


	public void logincommonsteps(String username,String password) throws FileNotFoundException, IOException {
		elementsendkeys(getUsername(), username);
		elementsendkeys(getPassword(), password);

	}
	public void login() throws FileNotFoundException, IOException {
		logincommonsteps(getPropertyFileValue("username"), getPropertyFileValue("password"));
	}

	public void laboratory () {
		elementclick(laboratory);
	}

	public void loginbtn() {
		elementclick(loginbtn);
	}


	public void patientMenu() {
		elementclick(registerPatient);
	}



}