package test;
import Drivers.SelDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import util.Wait;

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

    public void checkColorValue(){

        // driver is instructed to go to target website
        driver.get("http://www.poppin.com");

        // removes popup that loads when window opens (sometimes it will not be found 25% chance
        driver.findElement(By.cssSelector(".ltkmodal-close")).click();
        //list of WebElements that contain the buttons
        List<WebElement> buttonColorCheck = driver.findElements(By.className("header-swatch"));
        //calls index zero which is for white products and clicks the link
        buttonColorCheck.get(0).click();
        // method checks to see if the current destination is the same as the expected
        assertEquals("http://www.poppin.com/color/white/",driver.getCurrentUrl());
        //moves back to previous page
        driver.navigate().back();
        //case yellow
        /* issue is found here regardless of what is preformed regardless of identification
            method I encounter is a stale element reference exception or reference not found.
            Sometimes the program will find the second element then fail for the third object.
            clicking the link provided by selenium it states this is a website based issue
            and requires special actions to solve*/
        buttonColorCheck.get(1).click();
        assertEquals("http://www.poppin.com/color/yellow/",driver.getCurrentUrl());
        driver.navigate().back();
        //case orange
        buttonColorCheck.get(2).click();
        assertEquals("http://www.poppin.com/color/orange/",driver.getCurrentUrl());
        driver.navigate().back();

        //case red
        buttonColorCheck.get(3).click();
        assertEquals("http://www.poppin.com/color/red/",driver.getCurrentUrl());
        driver.navigate().back();
        //case pink
        buttonColorCheck.get(4).click();
        assertEquals("http://www.poppin.com/color/pink/",driver.getCurrentUrl());
        driver.navigate().back();
        // case lime green
        buttonColorCheck.get(5).click();
        assertEquals("http://www.poppin.com/color/lime-green/",driver.getCurrentUrl());
        driver.navigate().back();
        driver.findElement(By.linkText("view lime green products")).click();
        assertEquals("http://www.poppin.com/color/lime-green/",driver.getCurrentUrl());
        driver.navigate().back();
        //aqua
        buttonColorCheck.get(6).click();
        assertEquals("http://www.poppin.com/color/aqua/",driver.getCurrentUrl());
        driver.navigate().back();
        //case pool blue
        buttonColorCheck.get(7).click();
        assertEquals("http://www.poppin.com/color/pool-blue/",driver.getCurrentUrl());
        driver.navigate().back();
        //case navy
        buttonColorCheck.get(8).click();
        assertEquals("http://www.poppin.com/color/navy/",driver.getCurrentUrl());
        driver.navigate().back();
        //case purple
        buttonColorCheck.get(9).click();
        assertEquals("http://www.poppin.com/color/purple/",driver.getCurrentUrl());
        driver.navigate().back();
        //case black
        buttonColorCheck.get(10).click();
        assertEquals("http://www.poppin.com/color/black/",driver.getCurrentUrl());
        driver.navigate().back();
        //case dark grey
        buttonColorCheck.get(11).click();
        assertEquals("http://www.poppin.com/color/dark-gray/",driver.getCurrentUrl());
        driver.navigate().back();
        //case light gray
        buttonColorCheck.get(12).click();
        assertEquals("http://www.poppin.com/color/light-gray/",driver.getCurrentUrl());
        driver.navigate().back();
        //case metallic
        buttonColorCheck.get(13).click();
        assertEquals("http://www.poppin.com/color/metallic/",driver.getCurrentUrl());
        driver.navigate().back();


    }
    @Test
    //Test to verify that the color bar int he  hompage goes ti the correct landing page
    public void verifyColorOnHomepage(){
        driver.get("http://www.poppin.com");
        Wait.sleep(15000);

        //close pop modal
        if( driver.findElement(By.xpath(".//*[@id='close-button']/a")).isDisplayed()){
            driver.findElement(By.xpath(".//*[@id='close-button']/a")).click();
        }

        Wait.sleep(4000);
        //click on clors and verify page
        String [] colors ={"white","yellow","blue", "red"};
        List <WebElement> colorBars = driver.findElements(By.cssSelector(".header-swatch"));

        for(int i =0; i<colorBars.size();i++){
           driver.findElement(By.linkText(" view "+colors[i]+" products ")).click();
            Wait.sleep(5000);
            assertEquals("http://www.poppin.com/color/"+colors[i]+"/",driver.getCurrentUrl());
            driver.navigate().back();
            Wait.sleep(5000);
        }

    }
}
