package utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WaitUtils {

    static ConfigReader env=new ConfigReader("src/main/resources/env.properties");
    private static WebDriverWait getWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(
                Integer.parseInt(env.get("wait.timeout"))));
    }

    public static WebElement waitForElementClickable(WebDriver driver, By locator) {
        return getWait(driver).until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static WebElement waitForVisibility(WebDriver driver, By locator) {
        return getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForDisplaying(WebDriver driver, By locator) {
        return getWait(driver).until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
