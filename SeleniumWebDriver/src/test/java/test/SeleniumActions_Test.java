package test;

import Drivers.SelDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by Kyle Alex on 12/18/2016.
 */
public class SeleniumActions_Test extends SelDriver {

    @Test
    public void PrinstonReviewHw()  throws InterruptedException {


        // Method to get to the website to retrieve web element
        driver.get(("https://www.princetonreview.com/"));
        // opens drop menue to acess the SAT link
        driver.findElement(By.id("testPrepNav")).click();
        driver.findElement(By.id("testPrepNav")).click();
        //Clicks the link and proceeds to next page
        driver.findElement(By.linkText("SAT")).click();
        // prints the web element text via Class Name
        WebElement sATText = driver.findElement(By.className("col-sm-4"));
        System.out.println(sATText.getText());


    }



}
