package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Coimbatore"+ Keys.ENTER);
        driver.findElement(By.partialLinkText("Coimbatore - Wikipedia")).click();
       // driver.findElement(By.linkText("Coimbatore - Wikipedia")).click();
    }

}
