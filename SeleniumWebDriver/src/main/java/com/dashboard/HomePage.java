package com.dashboard;

import Drivers.SelDriver;
import com.review.MainPage;
import com.review.StudentTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.Switch_Windows;
import util.Wait;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by E on 1/3/2017.
 */
public class HomePage extends SelDriver {
public static String getDates(String xpathLink, String actualDate) {

   //method that changes date on calendar returns value of WebElement
    WebElement dateConfirm = driver.findElement(By.cssSelector(".form-control.userDetail"));

        driver.findElement(By.cssSelector(".fa.fa-calendar")).click();
        Wait.waitForXpath(driver,xpathLink);
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
    Wait.waitForCssSelector(driver,"#TargetScores_Subjects_0__Score");


}

public static void SchoolSelector(){
   //unable to find WebElements to directly remove schools
    driver.get("http://www.princetonreview.com");
    MainPage.signIn("sirkibble1988@gmail.com", "Blastingrod");
    StudentTools.launchDashboard("SAT");
    Switch_Windows.windowSwitchViaLinkText(driver,"Target Schools");
    List <WebElement> button = driver.findElements(By.partialLinkText(("University")));
    Switch_Windows.windowSwitchviaIndex(driver, button.get(0));
    driver.findElement(By.cssSelector(".saveMultiItemButton.btn.btn-block.btn-saved")).click();












}
}