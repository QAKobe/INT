package com.test.parallel_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LambdaParallelMain {

    public WebDriver driver;

    public LambdaParallelMain(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Table Pagination')]")
    WebElement tableBtn;

    public void clickTabletBtn(){
        tableBtn.click();
    }

}
