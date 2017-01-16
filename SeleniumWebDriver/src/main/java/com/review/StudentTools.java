package com.review;

import Drivers.SelDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.Wait;


public class StudentTools extends SelDriver{


    public static void launchDashboard(String TestType){
          MainPage.clickStudentTools();
        if (TestType.equals("SAT")){
            driver.findElement(By.cssSelector(".btn.btn-sm.btn-primary")).click();
            Wait.waitForElementViability(By.cssSelector(".h2.target-scores-header.btn-link"),5);
            Wait.sleep(2000);
        }}}


