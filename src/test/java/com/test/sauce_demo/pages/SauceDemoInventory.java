package com.test.sauce_demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class SauceDemoInventory {

    public SauceDemoInventory(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);

    }

    @FindBy(css = ".inventory_item_description")
    WebElement allProducts;

    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    List<WebElement> addToCardButtons;

    @FindBy(css = ".shopping_cart_link")
    WebElement cart;


    public void verifyAndAddProducts() {

        for (WebElement element : addToCardButtons) {

            if (element.isDisplayed()) {
                element.click();
            }
        }
    }

    public void clickCart() {
        cart.click();
    }


}
