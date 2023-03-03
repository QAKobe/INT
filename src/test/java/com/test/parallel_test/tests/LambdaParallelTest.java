package com.test.parallel_test.tests;

import com.test.parallel_test.pages.LambdaParallelMain;
import com.test.parallel_test.pages.TableParallel;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class LambdaParallelTest {


    /*
     This class is to test parallel tests

    By default TestNG has 5 thread counts, therefore, initially we dont have to
    declare our thread counts.

     */

    @Test()
    public void TC_ParallelChrome() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(ConfigReader.readProperty("lambdaUrl"));
        LambdaParallelMain main = new LambdaParallelMain(driver);
        main.clickTabletBtn();

        TableParallel table = new TableParallel(driver);
        table.namesAndEmails("Show ALL Rows");

    }

    @Test()
    public void TC_ParallelFireFox() {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get(ConfigReader.readProperty("demoQAURL"));


    }

    @Test()
    public void TC_ParallelEdge() {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get(ConfigReader.readProperty("webOrderUrl"));


    }

}

