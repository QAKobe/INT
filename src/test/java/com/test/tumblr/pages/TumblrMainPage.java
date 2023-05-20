package com.test.tumblr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class TumblrMainPage {

    public WebDriver driver;
    public TumblrMainPage(WebDriver driver){
       this.driver =driver;
    }


    private By loginOther = By.xpath("//span[contains(text(),'Log in')]");
    private By loginBtn = By.xpath("//a[@href='/login']");

    private By withEmail = By.xpath("//button[@class='dKGjO'] ");

    private By emailField = By.xpath("//p[contains(text(),'Enter')]//following-sibling::input");

    //input[@name='email'] --> css locator of it down below
    private By emailFieldCssVersion = By.cssSelector("input[name='email']");

    private By nextBtn = By.xpath("//span[text()='Next']");

    private By setPasswordFld = By.cssSelector(".sL4Tf");

    private By errorMsg = By.xpath("//div[@class='a0A37 hAkP2']");


    public WebElement loginBtn(){
        return driver.findElement(loginBtn);
    }

    public WebElement withEmail(){
       return driver.findElement(withEmail);
    }

    public WebElement emailFieldCss(){
        return driver.findElement(emailFieldCssVersion);
    }

    public List<WebElement> nextBtn(){
        return driver.findElements(nextBtn);
    }

    public List<WebElement>passwords() throws InterruptedException {

        return driver.findElements(setPasswordFld);
    }

    public WebElement errorMsg(){
        return driver.findElement(errorMsg);
    }

    public WebElement loginOther(){
        return driver.findElement(loginOther);
    }

//The password must be at least 8 characters long.











}
