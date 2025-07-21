package com.inmotion.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class CartPage
{
    WebDriver driver;
    By viewCartBtn = By.linkText("View Cart");
    By cartItems = By.cssSelector(".cart-item");
    By removeItemBtn = By.cssSelector(".remove-item");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        WaitUtils.waitForVisibility(driver, cartItems);
    }
    public int getItemCount() {
        return driver.findElements(cartItems).size();
    }
    public void removeFirstItem() {
        driver.findElements(removeItemBtn).get(0).click();
    }
}
