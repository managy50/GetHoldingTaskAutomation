package com.inmotion.tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.DriverManager;
import com.inmotion.pages.HomePage;
import com.inmotion.pages.DomainSearchPage;
import utils.ConfigReader;
public class DomainTests
{
    WebDriver driver;
    HomePage homePage;
    DomainSearchPage domainPage;
    ConfigReader env = new ConfigReader("src/main/resources/env.properties");
    @BeforeClass
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get(env.get("URL"));
        homePage = new HomePage(driver);
    }

    @Test
    public void testSearchAndAddDomain() {
        homePage.clickDomainSearch();
        domainPage = new DomainSearchPage(driver);
        domainPage.searchDomain("myautomationtest123.com");
         domainPage.openDomainPageAndGetPrice();
    }



    @AfterClass
    public void tearDown() {
       // driver.quit();
    }
}
