package com.inmotion.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.WaitUtils;
public class DomainSearchPage
{
    WebDriver driver;
    By searchInput = By.id("domain_search_domain");
    By searchBtn = By.id("domain_submit");
    By priceLabel = By.cssSelector(".price-value");
    By addToCartBtn = By.xpath("//button[text()='Add to Cart']");
    By domainButton = By.xpath("//div//span[text()='DOMAIN']");


    public DomainSearchPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void  searchDomain(String domain)
    {
        WaitUtils.waitForVisibility(driver,searchInput).sendKeys(domain);
        WaitUtils.waitForVisibility(driver,searchBtn).click();


    }

    public void addDomainToCart()
    {
        WaitUtils.waitForElementClickable(driver, addToCartBtn).click();
    }
    public void openDomainPageAndGetPrice ()
    {
        WaitUtils.waitForVisibility(driver,domainButton).click();

    }


}
