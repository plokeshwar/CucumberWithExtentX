package com.cucumber.stepdefinitions;

import com.cucumber.listener.Reporter;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

import org.testng.Assert;

public class MyStepdefs {

    @Before
    public void beforeScenario(Scenario scenario) {
        if (scenario.getName().equals("My First Scenario")) {
            Reporter.assignAuthor("Pravin");
        }
    }

    @Given("I have (\\d+) cukes in my belly") public void I_have_cukes_in_my_belly(int cukes)
        throws IOException {
        Reporter.addStepLog("My test addStepLog message");
        Reporter.addScenarioLog("This is scenario log");
        Reporter.addScreenCaptureFromPath("C:/Users/Plokeshwar/Videos/Pictures/test.jpg", "Screenshot1");
        //        Reporter.addScreenCaptureFromPath(
        //            "/Users/vimalrajselvam/Downloads/best-resume-template-2016-3.jpg", "My title");
    }

    @Given("I have (\\d+) cukes in my bellies") public void I_have_cukes_in_my_bellies(int cukes) throws IOException {
        System.out.format("Cukes: %n\n", cukes);
        Reporter.addScreenCaptureFromPath("C:/Users/Plokeshwar/Videos/Pictures/test.jpg", "Screenshot1");
        
    }

    @Then("^I print$") public void iPrint() throws Throwable {
        Reporter.addStepLog("I am printing.");  
        Reporter.addScreenCaptureFromPath("C:/Users/Plokeshwar/Videos/Pictures/test.jpg", "Screenshot1");
        
    	// Assert.assertTrue(false);
    }

    @When("^I login with credentials$") public void iLoginWithCredentials(DataTable table) throws IOException {
    	 Reporter.addStepLog("I am logging in with valid credentials."); 
    	 Reporter.addScreenCaptureFromPath("C:/Users/Plokeshwar/Videos/Pictures/test.jpg", "Screenshot1");
         
    }
}
