package com.hooks;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	
	@Before
	public static void preRequisites() throws FileNotFoundException, IOException {
		getdriver(getPropertyFileValue("browser"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@After
	public void tearDown(Scenario scenario) throws IOException {
	String scenarioName	= scenario.getName();
		if(scenario.isFailed()) {
			scenario.attach(takeScreenShortByte(), "image/png", scenarioName);
		}
		quitwindow();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
