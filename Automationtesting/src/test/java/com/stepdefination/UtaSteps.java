package com.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reusable.BrowserInvoc;

import java.io.IOException;

public class UtaSteps extends BrowserInvoc {

    @Given("User enters the UTA home page")
        public void uTAHome () throws IOException {
        BrowserInvoc.launchApplication();

    }

    @When("User clicks the Platform highlights button on top")
    public void userClicksThePlatformHighlightsButtonOnTop() {
        driver.findElement(By.linkText("PLATFORM HIGHLIGHTS")).click();

    }

    @Then("User should be able to navigate to the bottom of the page to see the available options")
    public void userShouldBeAbleToNavigateToTheBottomOfThePageToSee() {

    }

    @When("User clicks the first button \\(platform) inside the Platform highlights page")
    public void userClicksTheFirstButtonPlatformInsideThePlatformHighlightsPage() {

        driver.findElement(By.linkText("PLATFORM")).click();
    }

    @Then("User should be able to navigate to platform link")
    public void userShouldBeAbleToNavigateToPlatformLink() {
    }

    @When("User clicks the case studies button inside the Platform highlights page")
    public void userClicksTheCaseStudiesButtonInsideThePlatformHighlightsPage() {

        driver.findElement(By.linkText("CASE STUDIES")).click();
    }

    @Then("User should be able to navigate to case studies link")
    public void userShouldBeAbleToNavigateToCaseStudiesLink() {

    }

    @When("User clicks the resoursces button inside the Platform highlights page")
    public void userClicksTheResourscesButtonInsideThePlatformHighlightsPage() {
        driver.findElement(By.linkText("RESOURCES")).click();
    }

    @Then("User should be able to navigate to resources link")
    public void userShouldBeAbleToNavigateToResourcesLink() {

    }

    @When("User clicks the About button inside the Platform highlights page")
    public void userClicksTheAboutButtonInsideThePlatformHighlightsPage() {
        driver.findElement(By.partialLinkText("ABOUT")).click();
    }

    @Then("User should be able to navigate to About link")
    public void userShouldBeAbleToNavigateToAboutLink() {

    }

    @When("User clicks the Contact button inside the Platform highlights page")
    public void userClicksTheContactButtonInsideThePlatformHighlightsPage() {
        driver.findElement(By.partialLinkText("CONTACT")).click();
    }

    @Then("User should be able to navigate to Contact link")
    public void userShouldBeAbleToNavigateToContactLink() {

    }
}
