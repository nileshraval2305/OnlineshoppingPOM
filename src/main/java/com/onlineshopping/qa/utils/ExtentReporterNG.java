package com.onlineshopping.qa.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	
	
	public static ExtentReports getReportObj()
	{
		
		String path = System.getProperty("user.dir")+"//Testreports/reports.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Regression Report");
		reporter.config().setReportName("Regression ");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		return extent;
	}

}
