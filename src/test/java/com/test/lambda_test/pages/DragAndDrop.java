package com.test.lambda_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import utils.BrowserUtils;

import java.util.List;

public class DragAndDrop {

    public WebDriver driver;

    public DragAndDrop(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@id='droppable']")
    WebElement dropZone;

    @FindBy(xpath = "//p[contains(text(),'Dropped!')]")
    WebElement droppedMessage;

    @FindBy(xpath = "//p[contains(text(),'Drag me to my target')]")
    WebElement draggable;


    public void dragDroppable(WebDriver driver, String droppedMsg) throws InterruptedException {

        Actions actions = new Actions(driver);
        actions.scrollByAmount(500, 500).perform();
        Thread.sleep(2000);
        actions.dragAndDrop(draggable, dropZone).perform();
        Assert.assertEquals(BrowserUtils.getText(droppedMessage), droppedMsg);


    }

}
