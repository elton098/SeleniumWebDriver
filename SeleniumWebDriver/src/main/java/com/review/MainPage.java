package com.review;


import Drivers.SelDriver;
import org.openqa.selenium.By;
import util.Wait;

public class MainPage extends SelDriver{

    public static void signIn(String user, String password){

            driver.findElement(By.id("signInItem")).click();
            Wait.waitForCssSelector(driver,"#actionModal");
            driver.switchTo().frame("actionFrame");
            Wait.waitForID(driver,"Username");
            driver.findElement(By.id("Username")).sendKeys(user);
            driver.findElement(By.id("Password")).sendKeys(password);
            driver.findElement(By.cssSelector(".btn.btn-primary.btn-blue.btn-block")).click();
            driver.switchTo().defaultContent();
            Wait.sleep(4500);

   }


   public static void clickStudentTools(){
       driver.findElement(By.id("studentToolsItemHref")).click();
       Wait.waitForCssSelector(driver,".panel.panel-default");
   }




    }


