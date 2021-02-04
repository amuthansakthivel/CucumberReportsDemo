package com.steps;


import java.io.PrintStream;
import java.io.StringWriter;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class CommonSteps {

	protected StringWriter writer;
	protected PrintStream captor;

	private Scenario scenario;

	@Before(value = "not @failure")
	public void before(Scenario scenario) {
		this.scenario = scenario;
		scenario.log("BEFORE HI");
	}

	@After(value = "not @failure")
	public void after(Scenario scenario) {
		this.scenario = scenario;
		scenario.log("AFTER HI");
	}
/*
	@Before(value = "@failure")
	public void beforeFailure(Scenario scenario) { //
		System.out.println("Before failure");
		this.scenario = scenario;
		scenario.log("FAILURE HI");
		scenario.log("FAILURE HELLO");
		throw new RuntimeException();
	}*/

	@After(value = "@failure")
	public void afterFailure() { //
		System.out.println("After failure");
		scenario.log("FAILURE HI");
		scenario.log("FAILURE HELLO");
		throw new RuntimeException();
	}

/*	@BeforeStep(value = "@failure")
	public void beforeStepFailure() { //
		scenario.log("Before Step failure");
	}

	@AfterStep(value = "@failure")
	public void afterStepFailure() { //
		scenario.log("After Step failure");
	}
	
	@BeforeStep(value = "not @failure")
	public void beforeStepPassed() { //
		scenario.log("before Step passed");
	}

	@AfterStep(value = "not @failure")
	public void afterStepPassed() { //
		scenario.log("After Step passed");
	}*/

	public void log(String text) {
		scenario.log(text);
	}




}
