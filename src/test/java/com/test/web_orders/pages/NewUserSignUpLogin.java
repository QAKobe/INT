package com.test.web_orders.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/*
    Second this class and all data must be parameterized in xml file
 */
public class NewUserSignUpLogin {

    WebDriver driver;

    // These Xpath's used to sign up to the page
    @FindBy(how = How.XPATH, using = "//input[@type='text']")
    WebElement nameField;

    @FindBy(how = How.CSS, using = "input[data-qa='signup-email']")
    WebElement emailField;

    @FindBy(how = How.CSS, using = "button[data-qa='signup-button']")
    WebElement signUpBtn;

    // These Xpath's used to sign in into the webPage

    @FindBy(how = How.CSS, using = "input[data-qa='login-email']")
    WebElement userNameEmail;

    @FindBy(how = How.CSS, using = "input[data-qa='login-password']")
    WebElement userPassword;

    @FindBy(how = How.CSS, using = "button[data-qa='login-button']")
    WebElement loginBtn;


    public NewUserSignUpLogin(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    // sign up method with new email
    public void signUpFunction(String name, String email) throws Exception {
        try {
            nameField.sendKeys(name);
            emailField.clear();
            emailField.sendKeys(email);
            signUpBtn.click();
        }catch (Exception e){
            throw new Exception("Exception occurred to fill out the fields" + e.getMessage());
        }
    }


    // signs in you in existing userEmail
    public void signInFunction(String userName, String password){
        userNameEmail.sendKeys(userName);
        userPassword.sendKeys(password);
        loginBtn.click();
    }




}
