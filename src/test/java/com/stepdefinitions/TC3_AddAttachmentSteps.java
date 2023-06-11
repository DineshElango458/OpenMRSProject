package com.stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_AddAttachmentSteps extends BaseClass{
	PageObjectManager pm = new PageObjectManager();	

	@When("User should click Start Visit and Confirm Visit")
	public void userShouldClickStartVisitAndConfirmVisit() {
		pm.getConfirmPage().startVisit();
		pm.getConfirmPage().confirmStart();
	}

	@When("User should click Attachments menu")
	public void userShouldClickAttachmentsMenu() {
		pm.getUploadPage().attachment();
	}
	@When("User should  add attachment file")
	public void userShouldAddAttachmentFile() throws FileNotFoundException, IOException, AWTException, InterruptedException {
		pm.getFileUploadPage().addfile();
		String file = "C:\\Users\\DINESH\\eclipse-workspace\\OpenMRS\\image\\photo-1562690868-60bbe7293e94.jpg";
		StringSelection selection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot  r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	@When("User should enter msg in captions field {string} and Upload it")
	public void userShouldEnterMsgInCaptionsFieldAndUploadIt(String string) {
		pm.getFileUploadPage().caption(string);
	}
	@Then("User should verify toaster message \"The attachment was successfully uploaded.\"and redirect to Patient page")
	public void userShouldVerifyToasterMessageTheAttachmentWasSuccessfullyUploadedAndRedirectToPatientPage() throws InterruptedException {
		pm.getFileUploadPage().uploadbtn();
		pm.getFileUploadPage().nxtpgbtn();
	}


}
