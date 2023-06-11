package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue = {"com.stepdefinitions","com.hooks"},tags=("@Regression"),
plugin= {"pretty","json:target//OutPut.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"html:target//htmlreport.html","rerun:target//rerunfailed.txt"},
dryRun=false,monochrome=true,publish=true,stepNotifications=true)
public class TestRunner extends BaseClass{
   


	
	
	

@AfterClass
public static void afterClass() throws FileNotFoundException, IOException {
	Reporting.generateJVMReport(getProjectLoc()+getPropertyFileValue("jsonpath"));
}
}