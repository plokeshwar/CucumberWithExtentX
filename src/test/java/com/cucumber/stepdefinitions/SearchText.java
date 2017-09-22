package com.cucumber.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import cucumber.api.java.en.When;

public class SearchText extends com.cucumber.runner.CucumberRunner {

	@When("^I type \"(.*?)\"$")
	public void searchText(String text) throws Throwable {

		driver.findElement(By.cssSelector("input[name='q']")).sendKeys(text);
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys(Keys.ENTER);

	}

}
