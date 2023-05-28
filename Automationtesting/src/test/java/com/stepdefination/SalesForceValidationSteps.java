package com.stepdefination;

import AmazonPageObject.SignInPageSteps;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BrowserInvoc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class SalesForceValidationSteps {

    private WebDriver driver;


    @Given("User should navigate to salesforce application")
    public void loginPage() throws IOException {


        driver = BrowserInvoc.launchApplication();

    }

    @And("user clicks the login button")
    public void clickLoginButton() {

        driver.findElement(By.name("Login")).click();

    }

    @When("User Enters the username {string} and password {string}")
    public void userEntersTheUsernamePassword(String name, String password) {

        // driver.findElement(By.xpath("//input[@id='username']/parent::div"));

//      driver.findElement(By.id("username")).sendKeys(name);
//      driver.findElement(By.id("password")).sendKeys(password);

         driver.findElement(By.xpath(" //input[@id='username']")).sendKeys(name);
         driver.findElement(By.xpath(" //input[@name='pw']")).sendKeys(password);

//       driver.findElement(By.cssSelector(" input[id='username']")).sendKeys(name);
//       driver.findElement(By.cssSelector(" input[id='password']")).sendKeys(password);

    }

    @Then("User navigates to Home page.")
    public void navigatesToHomePage() {

    }

    @Then("User validates the error message {string}")
    public void validatesTheErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = driver.findElement(By.id("error")).getText();

    }

    @Then("user clicks the forget password link")
    public void clicksTheForgetPasswordLink() {

        driver.findElement(By.linkText("Forgot Your Password?")).click();

    }

    @Given("User navigates to the application")
    public void userNavigatesToTheApplication() throws IOException {

        driver = BrowserInvoc.launchApplication();


    }

    @When("User handles the dynamic dropdown")
    public void userHandlesTheDynamicDropdown() {

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

    @When("User handles the calendar boxes")
    public void userHandlesTheCalendarBoxes() {

        driver.findElement(By.className("ui-datepicker-month")).click();

//        int i = 0;
//        while (i < 5) {
//
//
//            i++;
//
//        }

//        driver.findElement(By.className("ui-datepicker-title")).click();
//        WebElement lastTable = driver.findElement(By.cssSelector("ui-datepicker-group.ui-datepicker-group-last"));
//       List<WebElement> endDate = lastTable.findElements(By.xpath("//td[@data-handler='selectDay']/a"));
//
//        for (WebElement l:endDate) {
//
//            if (l.getText().equals("17")){
//                l.click();
//                break;
//
//        }

        WebElement firstTable = driver.findElement(By.cssSelector(".ui-datepicker-group.ui-datepicker-group-first"));
        firstTable.findElement(By.cssSelector(".ui-datepicker-days-cell-over.ui-datepicker-current-day.ui-datepicker-today")).click();
        List<WebElement> date = firstTable.findElements(By.xpath("//td[@data-handler='selectDay']/a"));

        for (WebElement e : date) {

            if (e.getText().equals("29")) {
                e.click();
                break;
            }

        }
    }

    @When("User enters the username and password")
    public void userEntersTheUsernameAndPassword() {

        WebElement userName = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        userName.sendKeys("Anand");
        password.sendKeys("123");
        driver.navigate().refresh();

        try {
            userName.sendKeys("An");
            password.sendKeys("321");

        }
        catch(StaleElementReferenceException e){

            userName = driver.findElement(By.id("username"));
            password = driver.findElement(By.id("password"));
            userName.sendKeys("An");
            password.sendKeys("321");

        }
        catch (Exception e){

            e.printStackTrace();
        }

    }

    @When("User counts the links")
    public void userCountsTheLinks() {

       int totalCount = driver.findElements(By.tagName("a")).size();
        System.out.println(totalCount);

        WebElement footer = driver.findElement(By.xpath("//div[@class='row footer-top-section']"));
       int footerCount = footer.findElements(By.tagName("a")).size();
        System.out.println(footerCount);

        WebElement platForm = driver.findElement(By.id("nav_menu-3"));
        int platformSize = platForm.findElements(By.tagName("a")).size();
        System.out.println(platformSize);

        for (int i=0 ; i<platformSize ; i++){
            String keyActions = Keys.chord(Keys.CONTROL, Keys.ENTER);
            platForm.findElements(By.tagName("a")).get(i).sendKeys(keyActions);
        }

        Set<String> propValues = driver.getWindowHandles();

        for (String winPro:propValues) {
            String title = driver.switchTo().window(winPro).getTitle();
            System.out.println(title);
            if (title.contains("Privacy and Security of Data")){
                break;
            }
        driver.switchTo().defaultContent();
        }



    }
}