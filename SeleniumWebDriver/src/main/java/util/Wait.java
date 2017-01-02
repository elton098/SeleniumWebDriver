package util;

import Drivers.SelDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by E on 12/29/2016.
 */
public class Wait extends SelDriver {


    //Wait for specified amount of seconds
    public static void sleep(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void waitForCssSelector(WebDriver driver, String css){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
    }


    public static void waitForID(WebDriver driver, String id){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));

    }


    public static void waitForLinkText(WebDriver driver, String linkText){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkText)));
    }


    public static void waitForClassName(WebDriver driver, String className ){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
    }


    public static void waitForName(WebDriver driver, String name){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
    }


    public static void waitForXpath(WebDriver driver, String xPath){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
    }


    public static void waitForPartialLinkText(WebDriver driver, String partialLinkText) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(partialLinkText)));

    }

    public static void waitForTagName(WebDriver driver, String tagName){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(tagName)));
    }
}
