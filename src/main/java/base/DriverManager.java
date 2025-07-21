package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.ConfigReader;

import java.time.Duration;

public class  DriverManager {
   static WebDriver driver;
    static ConfigReader env;

    public static WebDriver getDriver() {
        env=new ConfigReader("src/main/resources/env.properties");
        String browser=env.get("browser");

        switch (browser.toLowerCase())
        {
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "firefox" :
                driver=new FirefoxDriver();
                break;
            case "edge" :
                driver=new EdgeDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(
                Integer.parseInt(env.get("wait.timeout"))));

        return driver;

    }

    public static void closeDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
