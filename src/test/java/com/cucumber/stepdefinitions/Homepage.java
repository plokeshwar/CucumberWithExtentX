package com.cucumber.stepdefinitions;

import org.testng.Assert;

import cucumber.api.java.en.Given;

public class Homepage extends com.cucumber.runner.CucumberRunner {

	@Given("^I am on google page$")
	public void googlePage() throws Throwable {

		String title = driver.getTitle();

	//	Assert.assertEquals(title, "Google");
	}

}
