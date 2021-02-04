package com.runner;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.constants.Constants;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Login.feature"},
		glue= {"com.steps"},
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"pretty","json:target/cucumber-reports/Cucumber.json",
	 "junit:target/cucumber-reports/Cucumber.xml",
	 "html:target/cucumber-reports/index.html"})
public class TestRunner {

	@BeforeClass
	public static void beforeClass() {
		
		System.out.println(System.getProperty("env"));
		System.out.println(System.getProperty("seleniumURL"));
	}

	@AfterClass
	public static void afterClass() throws IOException {
	

		File htmlFile = new File(Constants.EXTENTREPORTPATH);
		Desktop.getDesktop().browse(htmlFile.toURI());
	}


}
