package com.weekone_test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Kyle Alex on 12/18/2016.
 */
public class SeleniumActions_Test {

    @Test
    public void PrinstonReviewHw()  throws InterruptedException {

        /*For some reason I can't simply extend the other class so I decided to just
        call the System method to use the geko driver will most likely have to make a static method? or prehaps
        just call it before every test?*/

        System.setProperty("webdriver.firefox.marionette","C:\\drivers\\geckodriver.exe");
        // Driver created name is based on assignment
        FirefoxDriver prinstonReviewHw = new FirefoxDriver();
        // Method to get to the website to retrieve web element
        prinstonReviewHw.get(("https://www.princetonreview.com/"));
        // opens drop menue to acess the SAT link
        prinstonReviewHw.findElementById(("testPrepNav")).click();
        //Clicks the link and proceeds to next page
        prinstonReviewHw.findElementByLinkText(("SAT")).click();
        // prints the web element text via Class Name
        WebElement sATText = prinstonReviewHw.findElementByClassName ("col-sm-4");
        System.out.println(sATText.getText());















    }



}
