package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target//rerunfailed.txt",glue = {"com.stepdefinitions","com.hooks"},
plugin= {"pretty","json:target//OutPut2.json","html:target//htmlreport.html"},dryRun=false,monochrome=true,
publish=true,stepNotifications=true)
public class TestRunnerFailed {

	
	
}
