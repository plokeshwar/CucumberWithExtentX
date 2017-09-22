package com.cucumber.stepdefinitions;

import org.openqa.selenium.By;

import cucumber.api.java.en.Then;

public class Clearpage extends com.cucumber.runner.CucumberRunner {
	

	@Then("^I clear search textbox$")
	public void Clear() throws Throwable {

		driver.findElement(By.cssSelector("input[name='q']")).clear();

	}

}
