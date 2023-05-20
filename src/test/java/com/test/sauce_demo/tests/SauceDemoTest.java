package com.test.sauce_demo.tests;

import com.test.sauce_demo.pages.CartPage;
import com.test.sauce_demo.pages.MainPage;
import com.test.sauce_demo.pages.SauceDemoInventory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.ConfigReader;
import utils.DriverHelper;

public class SauceDemoTest extends BaseTest{

    WebDriver driver = DriverHelper.getDriver();

    @Test
    public void TC_01_VerifyLoginFunctionality() {
        driver.manage().window().maximize();
        MainPage page = new MainPage(driver);
        page.login("standard_user", "secret_sauce");
        SauceDemoInventory inventory = new SauceDemoInventory(driver);
        inventory.verifyAndAddProducts();
        inventory.clickCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.verifyAllProductsAndClickCheckout();
    }


}
