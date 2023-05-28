package com.stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BrowserInvoc;

import java.io.IOException;
import java.time.Duration;

public class CampusLifeSteps {

    WebDriver driver;

    @Given("User navigates to campus life application")
    public void navigatesToCampusLife() throws IOException {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.campuslife.co.in/contact.php");
        driver.manage().window().maximize();

    }

    @When("user fills the form")
    public void userFillsTheForm() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/div[1]/input")).sendKeys("anan".toUpperCase());
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/div[2]/input")).sendKeys("scie");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/div[3]/input")).sendKeys("an@gmail.com");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/div[4]/input")).sendKeys("Dubai");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/div[5]/textarea")).sendKeys("Peace");

    }

    @And("Clicks the send button")
    public void clicksTheSendButton() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/div[6]/input")).click();

    }

    @Then("User should be able to send successfully")
    public void userShouldBeAbleToSendSuccessfully() {

    }

    @Given("User navigates to Flexib application")
    public void userNavigatesToFlexibApplication() throws IOException {
        driver = BrowserInvoc.launchApplication();
    }


    @When("user fills the details in the form")
    public void userFillsTheDetailsInTheForm() {

        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("anan");
        driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("kum");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("ATC");
        driver.findElement(By.xpath("//input[@name='designation']")).sendKeys("Engineer");
        driver.findElement(By.xpath("//input[@placeholder='Email*']")).sendKeys("an1@gmail.com");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8787978786");
    }


    @And("User clicks the submit button")
    public void userClicksTheSubmitButton() {
        driver.findElement(By.xpath("//input[@class='submit']")).click();

    }

    @Then("User should be able to submit successfully")
    public void userShouldBeAbleToSubmitSuccessfully() {

    }


    @Given("User navigates to Swaglabs application")
    public void userNavigatesToSwaglabsApplication() throws IOException {

        driver = BrowserInvoc.launchApplication();

    }


    @When("User Enters the username and password")
    public void userEntersTheUsernameAndPassword() {
        String credentials = driver.findElement(By.xpath("//div[@id='login_credentials']")).getText();
        String password = driver.findElement(By.xpath("//div[@class='login_password']")).getText();
        System.out.println(credentials);
        System.out.println(password);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");


    }

    @And("User clicks the login button")
    public void userClicksTheLoginButton() {
        driver.findElement(By.id("login-button")).click();

    }

    @Then("User should be able to navigate to the swaglabs home page")
    public void userShouldBeAbleToNavigateToTheSwaglabsHomePage() {

    }

    @When("User clicks the filter dropdown & clicks low to high option")
    public void userClicksTheFilterDropdown() {
        driver.findElement(By.id("login-button")).click();
        WebElement lowToHighOption = driver.findElement(By.className("product_sort_container"));
        Select selectOption = new Select(lowToHighOption);
        selectOption.selectByValue("lohi");

    }


    @Then("User should be able to get the filtered result")
    public void userShouldBeAbleToGetTheFilteredResult() {

    }

    @Given("user navigates to the application")
    public void userNavigatesToTheApplication() {

        driver = new EdgeDriver();
        driver.navigate().to("https://www.travolook.in/");
        driver.manage().window().maximize();


    }

    @When("User handles the auto suggestive dropdown")
    public void userHandlesTheAutoSuggestiveDropdown() throws InterruptedException {

        driver.findElement(By.id("flying_from_N")).click();
        WebElement fromDrop = driver.findElement(By.name("flying_from"));
        fromDrop.sendKeys("che");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("flying_from")));

        int i = 0;
        while (i < 5) {

            fromDrop.sendKeys(Keys.ARROW_DOWN);
            i++;

        }
        fromDrop.sendKeys(Keys.ENTER);
    }
}