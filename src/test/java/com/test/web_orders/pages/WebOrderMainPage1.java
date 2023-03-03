package com.test.web_orders.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


/*
    First create this class and then check the web for test cases
 */
public class WebOrderMainPage1 {

    public WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[@href='/login']")
    WebElement signUpLoginBtn;

    public WebOrderMainPage1(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }


    /*
    click on signUpLoginBtn on webOrder mainPage
     */
    public void clickOnSignUpLoginBtn() throws Exception {
        try {
            signUpLoginBtn.click();
        }catch (Exception e){
            throw new Exception(
                    "Exception occurred to click on signUp/signBtn and the exception is " + e.getMessage());
        }
    }


}
