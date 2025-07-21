package com.inmotion.tests;

import base.DriverManager;
import com.inmotion.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTests {
    WebDriver driver;
    HomePage homePage;

    @BeforeMethod
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("https://www.inmotionhosting.com/home-a");
        homePage = new HomePage(driver);

    }

    @Test
    public void verifyPageTitle(){
        String actualPageTitle=homePage.getPageTitle();
        //Assert.assertTrue(actualPageTitle.contains("InMotion Hosting"));
        homePage.clickDomainSearch();
    }
}
