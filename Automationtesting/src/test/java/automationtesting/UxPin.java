package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UxPin {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.uxpin.com/sign-up");
        driver.findElement(By.id("email")).sendKeys("aanandkumar1124@gmail.com");
        driver.findElement(By.name("firstname")).sendKeys("Anand");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("page-sign-up")).click();
    }
}
