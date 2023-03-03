package com.test.web_orders.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import utils.BrowserUtils;

import java.util.List;

public class UserHomePage {

    public WebDriver driver;

    public UserHomePage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Logged')]")
    WebElement loggedInAs;

    @FindBy(how = How.XPATH, using = "//a[@href='/logout']")
    WebElement logOut;

    // verify first home is page is visible
    @FindBy(how = How.CSS, using = "a[href='/products']")
    WebElement productsBtn;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Home')]")
    WebElement homeBtn;

    public void logoutFunction(){

        logOut.click();


    }

    public void loggedInAsText(String loggedInMsg){
        Assert.assertEquals(BrowserUtils.getText(loggedInAs), loggedInMsg);
    }

    public void clickOnProducts(){
        productsBtn.click();
    }

    public void setHomeBtn(){
        homeBtn.click();
    }








}
