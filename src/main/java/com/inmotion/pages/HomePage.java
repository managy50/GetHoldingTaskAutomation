package com.inmotion.pages;

import base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utils.WaitUtils;

public class HomePage {
    WebDriver driver;
    By domainsMenu = By.xpath("//a[@title='Domains']");
    By hostingMenu = By.id("webHostingDropDown");

    public HomePage(WebDriver driver) {
       this.driver= driver;
    }
    public String getPageTitle(){
        return driver.getTitle();
    }

    public void hoverOverDomains() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(hostingMenu)).perform();
    }
    public void clickDomainSearch() {
        hoverOverDomains();
        WaitUtils.waitForVisibility(driver, domainsMenu);
        driver.findElement(domainsMenu).click();
    }



}
