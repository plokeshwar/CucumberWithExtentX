package com.cucumber.stepdefinitions;

import org.openqa.selenium.By;

import cucumber.api.java.en.Then;

public class SearchButton extends com.cucumber.runner.CucumberRunner {

	@Then("^I click search button$")
	public void searchButton() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.name("btnG")).click();

	}

}
