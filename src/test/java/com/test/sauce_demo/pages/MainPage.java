package com.test.sauce_demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MainPage {


    public MainPage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
    }

    @FindBy(css = "#user-name")
    WebElement userNameField;

    @FindBy(css = "#password")
    WebElement passwordField;

    // this css's following-sibling locator example
    @FindBy(css = ".error-message-container + input")
    WebElement loginButton;


    public void login(String userName, String password){

        userNameField.clear();
        userNameField.sendKeys(userName);
        passwordField.clear();
        passwordField.sendKeys(password);
        loginButton.click();

    }



}
