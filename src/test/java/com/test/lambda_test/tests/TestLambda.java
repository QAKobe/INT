package com.test.lambda_test.tests;

import com.test.lambda_test.pages.DragAndDrop;
import com.test.lambda_test.pages.LambdaMainPage;
import com.test.lambda_test.pages.Sliders;
import com.test.lambda_test.pages.TablePage;
import com.test.sauce_demo.tests.BaseTest;
import org.testng.annotations.Test;

public class TestLambda extends BaseTest {

    @Test()
    public void TC_04_AddNamesAndEmails() {

        LambdaMainPage page = new LambdaMainPage(driver);
        page.clickTablePagination();
        TablePage tablePage = new TablePage(driver);
        tablePage.namesAndEmails("Show ALL Rows");
    }

    @Test()
    public void TC_5_CheckDragAndDrop() throws InterruptedException {

        LambdaMainPage mainPage = new LambdaMainPage(driver);
        mainPage.clickDragAndDropBtn();
        DragAndDrop dragAndDrop = new DragAndDrop(driver);
        dragAndDrop.dragDroppable(driver, "Dropped!");


    }

    @Test()
    public void TC_06_TestSliders() throws InterruptedException {


        LambdaMainPage mainPage = new LambdaMainPage(driver);
        mainPage.clickOnSliders();
        Sliders sliders = new Sliders(driver);
       sliders.slideItAll(driver);

    }

}
