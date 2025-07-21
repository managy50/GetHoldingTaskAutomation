package com.inmotion.tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.inmotion.pages.CartPage;
import com.inmotion.pages.HomePage;
import com.inmotion.pages.DomainSearchPage;
import base.DriverManager;
import utils.ConfigReader;
public class CartPageTests
{
    WebDriver driver;
    HomePage homePage;
    DomainSearchPage domainPage;
    CartPage cartPage;
    ConfigReader env = new ConfigReader("src/main/resources/env.properties");

    @BeforeClass
    public void setUp() {
        driver = DriverManager.getDriver();
        homePage = new HomePage(driver);
        homePage.clickDomainSearch();
        domainPage = new DomainSearchPage(driver);
       // domainPage.searchDomain(ConfigReader.get("search.domain"));
        driver.get(env.get("search.domain"));
        domainPage.addDomainToCart();
    }

    @Test(priority=1)
    public void verifyCartHasDomain() {
        cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getItemCount(), 1, "Domain item not found in cart");
    }

    @Test(priority=2)
    public void removeDomainFromCart() {
        cartPage.removeFirstItem();
        Assert.assertEquals(cartPage.getItemCount(), 0, "Domain was not removed from cart");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
