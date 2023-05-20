package com.test.sauce_demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class CartPage {

    public CartPage(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);

    }

    @FindBy(css = ".cart_item_label")
    List<WebElement> allAddedProducts;

    // css parent child plus following sibling
    @FindBy(css = "div > button +button")
    WebElement checkOutButton;

    int count = 0;

    public void verifyAllProductsAndClickCheckout() {

        for (int i = 0; i < allAddedProducts.size(); i++) {

            if (allAddedProducts.get(i).isDisplayed()) {
                System.out.println(allAddedProducts.get(i).getText() + " is present");
                count++;
            }
            System.out.println(count);

        }

        checkOutButton.click();

    }


}
