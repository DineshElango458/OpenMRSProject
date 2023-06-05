package com.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass {
	
	
	public static void generateJVMReport(String jsonfile) throws FileNotFoundException, IOException {
		
		File f = new File(getProjectLoc()+getPropertyFileValue("jvmpath"));
		
		Configuration config = new Configuration(f, "OpenMRS");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Windows OS Version", "Windows 10");
		config.addClassifications("BrowserVersion", "114");
		
		
		
		List<String> li = new ArrayList<String>();
		li.add(jsonfile);
		
		ReportBuilder report = new ReportBuilder(li, config);
		report.generateReports();
	}

	
	
}










