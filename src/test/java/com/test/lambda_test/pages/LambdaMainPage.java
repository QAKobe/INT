package com.test.lambda_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LambdaMainPage {

    // This class will is a starting point foll practices
    public WebDriver driver;

    public LambdaMainPage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Table Pagination')]")
    WebElement tablePagination;

    @FindBy(xpath = "//a[contains(text(),'Drag and Drop')]")
    WebElement dragAndDropBtn;

    @FindBy(xpath = "//a[contains(text(),'Drag & Drop Sliders')]")
    WebElement slidersBtn;

    public void clickTablePagination(){
        tablePagination.click();
    }

    public void clickDragAndDropBtn(){
        dragAndDropBtn.click();
    }

    public void clickOnSliders(){
        slidersBtn.click();
    }


}
