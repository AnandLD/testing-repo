package pageobject;

import org.openqa.selenium.By;
import reusable.BrowserInvoc;

public class PageObjectAmazon extends BrowserInvoc {

    public PageObjectAmazon clickSignInButton(){

        driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
        return this;
    }

    public PageObjectAmazon enterEmailId(){

        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("anandkumaar1124@gmail.com");
        return this;

    }

    public PageObjectAmazon clickContinueButton(){

        driver.findElement(By.xpath("//input[@id='continue']")).click();
        return this;
    }

    public PageObjectAmazon enterPassword(){

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Qwer@123");
        return this;

    }
    public PageObjectAmazon signInSubmit(){

        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        return this;

    }

    public PageObjectAmazon searchProduct(){

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Electric cooker");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        return this;

    }
    public PageObjectAmazon selectsTheProduct(){

        driver.findElement(By.partialLinkText("Instant Pot Duo 7-in-1 Electric Pressure Cooker, Slow Cooker, Rice Cooker, Steamer, Sauté")).click();
        return this;
    }

    public PageObjectAmazon clickToAddCartButton(){

        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        return this;
    }

    public PageObjectAmazon proceedToCart() {

        driver.findElement(By.cssSelector(".a-button.a-button-primary.attach-primary-button.attach-button-large.attach-checkout-button")).click();
        return this;

    }


}
