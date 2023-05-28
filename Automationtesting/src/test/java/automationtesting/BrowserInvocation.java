package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserInvocation {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("LearnMore");
        driver.findElement(By.name("pw")).sendKeys("123");
        driver.findElement(By.name("Login")).click();
        String errorMessage = driver.findElement(By.id("error")).getText();
        System.out.println(errorMessage);
    }
}
