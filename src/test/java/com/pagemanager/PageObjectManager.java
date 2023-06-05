package com.pagemanager;

import com.pages.LoginPage;
import com.pages.PatientPage;
import com.pages.SearchIdPage;
import com.pages.UploadPage;
import com.pages.VerificationPage;
import com.pages.ConfirmPage;
import com.pages.DeletePage;
import com.pages.FileUploadPage;

public class PageObjectManager {


	private LoginPage loginPage;
	private PatientPage patientPage;
	private ConfirmPage confirmPage;
	private UploadPage uploadPage;
	private FileUploadPage fileuploadPage;
	private VerificationPage verifypage;
	private DeletePage deletepage;
	private SearchIdPage searchid;

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}
	public PatientPage getPatientPage() {
		return (patientPage == null) ? patientPage = new PatientPage() : patientPage;
	}
	public ConfirmPage getConfirmPage() {
		return (confirmPage == null) ? confirmPage = new ConfirmPage() : confirmPage;
	}
	public UploadPage getUploadPage() {
		return (uploadPage == null) ? uploadPage = new UploadPage() : uploadPage;
	}
	public FileUploadPage getFileUploadPage() {
		return (fileuploadPage == null) ? fileuploadPage = new FileUploadPage() : fileuploadPage;
	}
	public VerificationPage getVerificationPage() {
		return (verifypage == null) ? verifypage = new VerificationPage() : verifypage;
	}
	public DeletePage getDeletePage() {
		return (deletepage == null) ? deletepage = new DeletePage() : deletepage;
	}
	public SearchIdPage getSearchIdPage() {
		return (searchid == null) ? searchid = new SearchIdPage() : searchid;
	}

}
