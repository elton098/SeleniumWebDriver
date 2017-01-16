package com.dashboard;

import Drivers.SelDriver;
import com.review.MainPage;
import com.review.StudentTools;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.Switch_Windows;
import util.Wait;
import java.util.List;
import java.util.MissingResourceException;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by E on 1/3/2017.
 */
public class HomePage extends SelDriver {
public static String getDates(String xpathLink) {

   //method that changes date on calendar returns value of WebElement
    WebElement dateConfirm = driver.findElement(By.cssSelector(".form-control.userDetail"));

        driver.findElement(By.cssSelector(".fa.fa-calendar")).click();
        Wait.waitForElementViability(By.xpath(xpathLink),5);
        driver.findElement(By.xpath(xpathLink)).click();



    return dateConfirm.getAttribute("value");
}



    //method sets score for projected scores modo.
    public static String setScoreValueInBox(String CssSelector, String sendValue){
        WebElement targetBox = driver.findElement(By.cssSelector
                (CssSelector));

        Actions sliderActions = new Actions(driver);
        targetBox.clear();
        sliderActions.moveToElement(targetBox).click().sendKeys(sendValue).perform();


        return targetBox.getAttribute("Value");
    }
    //Method sets slider in modo to max value
    public static String setSliderValueToMax(String CssSelector) {
        WebElement mathScoreBox = driver.findElement(By.cssSelector(
                CssSelector));

        Actions sliderActions = new Actions(driver);
        sliderActions.moveToElement(mathScoreBox).moveByOffset(220, 0).click();
        sliderActions.perform();
        return mathScoreBox.getAttribute("value");


    }
//method clicks modo for scores
public static void clickTestModo(){
    driver.findElement(By.linkText("Target Scores")).click();
    Wait.waitForElementViability(By.cssSelector("#TargetScores_Subjects_0__Score"), 5);


}

public static void SchoolSelector() {
    //unable to find WebElements to directly remove schools
    driver.get("http://www.princetonreview.com");
    MainPage.signIn("sirkibble1988@gmail.com", "Blastingrod");
    StudentTools.launchDashboard("SAT");


     //If condition that checks if there are any schools present in current schools
    if (!driver.findElement(By.id("target-schools")).getText().contains("Avg RSAT")) {
       driver.findElement(By.linkText("Target Schools")).click();

       Switch_Windows.windowSwitch(1);
           } else {
                  driver.findElement(By.xpath((".//*[@id='tpr-schools']/tbody/tr[1]/td/div/div[2]/h5/a"))).click();
                  driver.findElement(By.xpath(".//*[@id='tpr-schools']/tbody/tr[2]/td/div/div[2]/h5/a")).click();
               Switch_Windows.windowSwitch(1);
               Wait.waitForElementViability(By.xpath(".//*[@id='tpr-schools']/div[5]/div/div[1]/div[2]/div[2]/ul/li/button"), 10);
               driver.findElement(By.xpath(".//*[@id='tpr-schools']/div[5]/div/div[1]/div[2]/div[2]/ul/li/button")).click();
               Wait.waitForElementViability(By.cssSelector(".btn.btn-sm.btn-primary.btn-block.modalConfirm-ok"), 10);
               driver.findElement(By.cssSelector(".btn.btn-sm.btn-primary.btn-block.modalConfirm-ok")).click();
               Switch_Windows.windowSwitch(2);
               Wait.waitForElementViability(By.cssSelector(".saveMultiItemButton.btn.btn-block.btn-saved"), 10);
               driver.findElement(By.cssSelector(".saveMultiItemButton.btn.btn-block.btn-saved")).click();
               Wait.waitForElementViability(By.cssSelector(".btn.btn-sm.btn-primary.btn-block.modalConfirm-ok"), 20);
               driver.findElement(By.cssSelector(".btn.btn-sm.btn-primary.btn-block.modalConfirm-ok")).click();
               Switch_Windows.windowSwitch(0);
               driver.findElement(By.linkText("Target Schools")).click();
               Switch_Windows.windowSwitch(3);}

          //Adds targeted schools
    driver.findElement(By.xpath("html/body/div[3]/div[3]/ul/li[2]/a")).click();
         driver.findElement(By.xpath(".//*[@id='schoolFilters']/div/a")).click();
    WebElement searchBox = driver.findElement(By.id("search"));
    String schools[] = new String[]{"Yale", "Harvard"};

    searchBox.click();
        searchBox.clear();
        searchBox.sendKeys(schools[0]);
        searchBox.submit();
        driver.findElement(By.cssSelector(".saveMultiItemButton.btn.btn-block.btn-primary")).click();
       WebElement searchBox2 = driver.findElement(By.id("search"));
    searchBox2.clear();
    searchBox2.sendKeys(schools[1]);
    searchBox2.submit();
    driver.findElement(By.cssSelector(".saveMultiItemButton.btn.btn-block.btn-primary")).click();
//Checks to see if web object contains targeted schools
    Switch_Windows.windowSwitch(0);
    Assert.assertTrue(driver.findElement(By.id("target-schools")).getText().contains("Yale"));
    Assert.assertTrue(driver.findElement(By.id("target-schools")).getText().contains("Harvard"));















}
}