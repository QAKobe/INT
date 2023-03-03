package com.test.web_orders.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class SingleProductPage {

    public WebDriver driver;

    public SingleProductPage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Blue Top')]")
    WebElement productName;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Category: Women > Tops')]")
    WebElement category;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Rs. 500')]")
    WebElement price;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),' In Stock')]")
    WebElement availability;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'New')]")
    WebElement condition;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Polo')]")
    WebElement brand;

    public void productDetails(){

        Assert.assertTrue(productName.isDisplayed());
        Assert.assertTrue(category.isDisplayed());
        Assert.assertTrue(price.isDisplayed());
        Assert.assertTrue(availability.isDisplayed());
        Assert.assertTrue(condition.isDisplayed());
        Assert.assertTrue(brand.isDisplayed());

    }

}
