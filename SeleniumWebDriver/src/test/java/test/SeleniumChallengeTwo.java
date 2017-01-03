package test;
import Drivers.SelDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import util.Wait;


import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


/**
 * Created by Kyle Alex on 12/27/2016.
 */
public class SeleniumChallengeTwo extends SelDriver {



   @Test
    //Test to verify that the color bar int he  hompage goes ti the correct landing page
    public void verifyColorOnHomepage() {
        driver.get("http://www.poppin.com");
        Wait.sleep(2000);

        //close pop modal
        if (driver.findElement(By.xpath(".//*[@id='close-button']/a")).isDisplayed()) {
            driver.findElement(By.xpath(".//*[@id='close-button']/a")).click();
        }

        Wait.sleep(2000);
        //click on clors and verify page
        String[] colors = {"white", "yellow", "orange", "red", "pink", "lime green", "aqua",
        "pool blue", "navy", "purple", "black", "dark gray", "light gray", "metallic"};
        String[] colorLinks = {"white", "yellow", "orange", "red", "pink", "lime-green", "aqua",
                "pool-blue", "navy", "purple", "black", "dark-gray", "light-gray", "metallic"};
        List<WebElement> colorBars = driver.findElements(By.cssSelector(".header-swatch"));

        for (int i = 0; i < colorLinks.length; i++) {
            driver.findElement(By.linkText("view " + colors[i] + " products")).click();
            Wait.sleep(2000);
            assertEquals("http://www.poppin.com/color/" + colorLinks[i] + "/", driver.getCurrentUrl());
            driver.navigate().back();
            Wait.sleep(2000);
        }
    }}




