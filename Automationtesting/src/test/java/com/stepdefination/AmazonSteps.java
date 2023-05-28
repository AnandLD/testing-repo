package com.stepdefination;

import AmazonPageObject.SignInPageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageobject.PageObjectAmazon;
import reusable.BrowserInvoc;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AmazonSteps {


    PageObjectAmazon pageObjectAmazon = new PageObjectAmazon();


    @Given("User logs in to amazon application and search for product")
        public void amazonloginpage() throws IOException {

        BrowserInvoc.launchApplication();

        pageObjectAmazon.clickSignInButton().enterEmailId().clickContinueButton().enterPassword().signInSubmit();

//        driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
//        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9443023417");
//        driver.findElement(By.xpath("//input[@id='continue']")).click();
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Qwer@123");
//        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();


    }



    @When("User selects the product and add to cart")
    public void userSelectsTheProductAndAddToCart() {

        pageObjectAmazon.searchProduct().selectsTheProduct().clickToAddCartButton();


//        driver.findElement(By.partialLinkText("Instant Pot Duo 7-in-1 Electric Pressure Cooker, Slow Cooker, Rice Cooker, Steamer, Sauté")).click();
//        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

    }

    @Then("The product added to the cart")
    public void theProductAddedToTheCart() {
    }
}
