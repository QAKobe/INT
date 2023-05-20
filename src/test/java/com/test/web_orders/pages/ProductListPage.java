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

public class ProductListPage {

    public WebDriver driver;

    public ProductListPage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'All')]")
    WebElement allProductsText;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'View Product')]")
    List<WebElement> productList;

    @FindBy(how = How.XPATH, using = "//a[@href='/product_details/1']")
    WebElement firstProduct;

    int count = 0;
    public void checkAllProductsExist(WebDriver driver, String text){


        Assert.assertEquals(BrowserUtils.getText(allProductsText), text);

        for (int i = 0; i < productList.size(); i++) {
            Assert.assertTrue(productList.get(i).isDisplayed());
            BrowserUtils.scrollWithPoint(driver, productList.get(i));
            System.out.println(productList.get(i).getText());
            count++;
        }
        System.out.println("All product quantity : " + count);
        firstProduct.click();

    }

}
