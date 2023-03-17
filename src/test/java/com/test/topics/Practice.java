package com.test.topics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class Practice {

    @Test()
    public void iframePractice() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        driver.switchTo().frame("frame1");
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'This is a sample page')]"));
        System.out.println(BrowserUtils.getText(message));
        Thread.sleep(2000);
        // This is not a nested iFrame just simply two seperate iframes
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame2");
        System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'This is a sample page')]")).getText());

        System.out.println("new code from Aizhamal");
        ////div[@id='slider1']//input[@type='range']
        ////div[@class='sp__range']
    }
}
