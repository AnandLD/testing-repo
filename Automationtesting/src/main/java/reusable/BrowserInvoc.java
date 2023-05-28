package reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BrowserInvoc {

    public static WebDriver driver;
    public static Properties prop;


    public static WebDriver launchApplication() throws IOException {

        String path = System.getProperty("user.dir");
        System.out.println(path);

        FileInputStream file = new FileInputStream(new File(path+"\\src\\main\\resources\\utility\\configuration.properties"));
        prop = new Properties();
        prop.load(file);

        switch (prop.getProperty("Browser").toLowerCase()){

            case "chrome":
                driver = new ChromeDriver();
                driver.navigate().to(prop.getProperty("URL"));
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                break;
            case "edge":
                driver = new EdgeDriver();
                driver.navigate().to(prop.getProperty("URL"));
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                break;
            default:
                throw new IllegalArgumentException();

        }

        return driver;

    }


}
