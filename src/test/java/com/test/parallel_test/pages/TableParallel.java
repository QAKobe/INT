package com.test.parallel_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TableParallel {

    public WebDriver driver;

    public TableParallel(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='maxRows']")
    WebElement selectAllRows;

    @FindBy(xpath = "//tr//td[contains(text(),'@')]")
    List<WebElement> allEmails;

    @FindBy(xpath = "//tr/td[2]")
    List<WebElement > allNames;


    public void namesAndEmails(String allRows){

        BrowserUtils.selectBy(selectAllRows, allRows, "text");


        for (int i = 0; i < allEmails.size(); i++) {
            Map<String, String> map = new LinkedHashMap<>();
            map.put(allNames.get(i).getText(), allEmails.get(i).getText());
            System.out.println(map);


        }



    }

}
