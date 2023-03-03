package com.test.sauce_demo.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.DriverHelper;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("lambdaUrl"));
    }

}
