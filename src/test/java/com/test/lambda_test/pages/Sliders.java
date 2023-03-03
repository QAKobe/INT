package com.test.lambda_test.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import javax.accessibility.AccessibleSelection;
import java.util.List;

public class Sliders {

    public WebDriver driver;

    public Sliders(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='slider1']//input[@type='range']")
    WebElement slider;

    @FindBy(xpath = "//div[@class='sp__range']")
    WebElement range;

    @FindBy(xpath = "//input[@type='range']")
    List<WebElement> allSliders;

    @FindBy(css = "output")
    List<WebElement> allOutput;

    public void slideIt() throws InterruptedException {

        while (!BrowserUtils.getText(range).equals("45")) {
            Thread.sleep(1000);
            slider.sendKeys(Keys.ARROW_RIGHT);
        }

    }

    public void slideItAll(WebDriver driver) throws InterruptedException {


        Actions actions = new Actions(driver);
        actions.scrollByAmount(400, 400).perform();
        for (int i = 0; i < 6; i++) {

            while (!BrowserUtils.getText(allOutput.get(i)).equals("75")) {
                if ( BrowserUtils.getText(allOutput.get(i)).equals("45")){
                    break;
                }else {
                    Thread.sleep(50);
                    allSliders.get(i).sendKeys(Keys.ARROW_RIGHT);
                }
            }

        }

    }

    public void slideAll2(WebDriver driver){

        Actions actions = new Actions(driver);
        actions.scrollByAmount(400, 400).perform();

        for (int i = 0; i < allSliders.size(); i++) {

            for (int j = 0; j < allSliders.get(i).getText().length(); j++) {

                if (Integer.parseInt(allOutput.get(i).getText()) <= 1 || Integer.parseInt(allOutput.get(i).getText()) <= 100){

                    allSliders.get(i).sendKeys(Keys.ARROW_RIGHT);


                }

            }



        }

    }
}
