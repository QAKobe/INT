package com.test.tumblr.tests;

import com.test.sauce_demo.tests.BaseTest;
import com.test.tumblr.pages.TumblrMainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.BrowserUtils;
import utils.DriverHelper;

import static org.testng.Assert.assertEquals;


public class TumblrTest extends BaseTest {

    WebDriver driver = DriverHelper.getDriver();

    @Parameters({"email", "password", "errorMsg"})

    @Test
    public void negativeTestLogin(String email, String password, String errorMsg) throws InterruptedException {

        TumblrMainPage mainPage = new TumblrMainPage(driver);
        mainPage.loginBtn().click();
        mainPage.withEmail().click();
        mainPage.emailFieldCss().sendKeys(email);
        mainPage.nextBtn().get(0).click();
        for (int i = 0; i < mainPage.passwords().size(); i++) {
            Thread.sleep(2000);
            mainPage.passwords().get(i).sendKeys(password);
            Thread.sleep(2000);
        }
        mainPage.nextBtn().get(0).click();
        assertEquals(errorMsg, BrowserUtils.getText(mainPage.errorMsg()));
        System.out.println(mainPage.errorMsg().getText());
    }
}

