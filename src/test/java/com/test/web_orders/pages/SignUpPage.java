package com.test.web_orders.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.Assert;
import utils.BrowserUtils;

public class SignUpPage {

    public WebDriver driver;

    public SignUpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(how = How.CSS, using = "#id_gender1")
    WebElement mrRadio;

    @FindBy(how = How.CSS, using = "input[id='password']")
    WebElement pwdField;

    @FindBy(how = How.CSS, using = "select[id='days']")
    WebElement selectDays;

    @FindBy(how = How.CSS, using = "select[id='months']")
    WebElement selectMonths;

    @FindBy(how = How.CSS, using = "select[id='years']")
    WebElement selectYears;

    // Address Information
    @FindBy(how = How.XPATH, using = "//input[@id='first_name']")
    WebElement firstName;

    @FindBy(how = How.XPATH, using = "//input[@id='last_name']")
    WebElement lastName;

    @FindBy(how = How.XPATH, using = "//input[@id='address1']")
    WebElement addressLine1;

    @FindBy(how = How.CSS, using = "select[id='country']")
    WebElement selectCountry;

    @FindBy(how = How.CSS, using = "#state")
    WebElement stateField;

    @FindBy(how = How.CSS, using = "#city")
    WebElement cityField;

    @FindBy(how = How.CSS, using = "#zipcode")
    WebElement zipCodeField;

    @FindBy(how = How.CSS, using = "#mobile_number")
    WebElement mobileNumber;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Create Account')]")
    WebElement createAccountBtn;

    @FindBy(how = How.CSS, using = "h2[data-qa='account-created']")
    WebElement accountCreatedMsg;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Congratulations!')]")
    WebElement congratulationMsg;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;

    @FindBy(how = How.XPATH, using = "//iframe[@id='ad_iframe']")
    WebElement iframe;

    @FindBy(how = How.XPATH, using = "//div[@id='dismiss-button']")
    WebElement closeBtn;

    // filling out form for new user
    public void fillOutForm(WebDriver driver, String password, String day, String month, String year,
                            String fName, String lName, String address, String country, String state,
                            String city, String zipcode, String mobile) throws InterruptedException {
        mrRadio.click();
        pwdField.sendKeys(password);
        Thread.sleep(5000);
        BrowserUtils.selectBy(selectDays, day, "text");
        BrowserUtils.selectBy(selectMonths, month, "text");
        BrowserUtils.selectBy(selectYears, year, "text");
        BrowserUtils.scrollViewWithJS(driver, firstName);
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        addressLine1.sendKeys(address);
        BrowserUtils.selectBy(selectCountry, country, "text");
        stateField.sendKeys(state);
        BrowserUtils.scrollViewWithJS(driver, createAccountBtn);
        cityField.sendKeys(city);
        zipCodeField.sendKeys(zipcode);
        mobileNumber.sendKeys(mobile);
        createAccountBtn.click();

    }

    // account created message validated
    public void getSuccessMsgAndContinue(String text, String congratsText){

        Assert.assertEquals(BrowserUtils.getText(accountCreatedMsg), text);
        Assert.assertEquals(BrowserUtils.getText(congratulationMsg), congratsText);
        continueBtn.click();

    }

    //handles iframe
    public void handleIframe(WebDriver driver){

        driver.switchTo().frame("aswift_2");
        driver.switchTo().frame("ad_iframe");
        closeBtn.click();


    }



















}
