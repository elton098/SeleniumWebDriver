package com.Practice_Exam;

import Drivers.SelDriver;
import org.apache.bcel.generic.NEW;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import util.Wait;
import util.Switch_Windows;


import java.util.List;

/**
 * Created by Kyle Alex on 1/19/2017.
 */
public class SAT_PracticeExam extends SelDriver {

    public static void getToExam(){

        driver.findElement(By.linkText("Practice Tests")).click();

        Wait.sleep(5000);




    }
    public static void pickExam(String testIndex){
        List<WebElement> test = driver.findElements(By.cssSelector(".fa.fa-desktop"));

        if(testIndex.equalsIgnoreCase("A")){


            test.get(1).click();


        }
        else if(testIndex.equalsIgnoreCase("B")){

            test.get(2).click();


        }
        else if(testIndex.equalsIgnoreCase("D")){

            test.get(3).click();



    }
        else if(testIndex.equalsIgnoreCase("D")) {

            test.get(4).click();
        }


        else{


                test.get(0).click();
        }

}

public static void setTestLength(String time){
    WebElement optioBox = driver.findElement(By.xpath(".//*[@id='content-player']/div/div/div[2]/div/div/div[2]/div/select"));
    Wait.sleep(5000);
    Select option = new Select(optioBox);

    if (time.equalsIgnoreCase("in half")){


    option.selectByValue("1.5");
    Wait.sleep(5000);
    driver.findElement(By.xpath(".//*[@id='content-player']/div/div/div[2]/div/div/div[2]/div/button")).click();
    driver.findElement(By.xpath(".//*[@id='content-player']/div/div/div[2]/div/div/div[2]/div/button")).click();
    Wait.sleep(5000);}

    else if(time.equalsIgnoreCase("double")){


        option.selectByValue("20");
        Wait.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='content-player']/div/div/div[2]/div/div/div[2]/div/button")).click();
        driver.findElement(By.xpath(".//*[@id='content-player']/div/div/div[2]/div/div/div[2]/div/button")).click();
        Wait.sleep(5000);


    }

    else if (time.equalsIgnoreCase("untimed")){


        option.selectByValue("0");
        Wait.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='content-player']/div/div/div[2]/div/div/div[2]/div/button")).click();
        driver.findElement(By.xpath(".//*[@id='content-player']/div/div/div[2]/div/div/div[2]/div/button")).click();
        Wait.sleep(5000);

    }

    else{

        option.selectByValue("0");
        Wait.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='content-player']/div/div/div[2]/div/div/div[2]/div/button")).click();
        driver.findElement(By.xpath(".//*[@id='content-player']/div/div/div[2]/div/div/div[2]/div/button")).click();
        Wait.sleep(5000);







    }
}

    public static void exitExamAndDisplayScore(){

        Wait.waitForElementViability(By.cssSelector(".btn.btn-sm.btn-default-eval.section-btn-end"),20);

        driver.findElement(By.cssSelector(".btn.btn-sm.btn-default-eval.section-btn-end")).click();
        Wait.waitForElementViability(By.cssSelector(".btn.btn-sm.btn-primary.btn-block.modalConfirm-ok"),20);
        driver.findElement(By.cssSelector(".btn.btn-sm.btn-primary.btn-block.modalConfirm-ok")).click();
        Wait.sleep(8000);
        Wait.waitForElementViability(By.xpath(".//*[@id='tpr-practice']/div[1]/div[2]/div[2]/div/div[2]/h1"),20);
       WebElement score = driver.findElement(By.xpath(".//*[@id='tpr-practice']/div[1]/div[2]/div[2]/div/div[2]/h1"));
        System.out.println(score.getText());

    }

    public static void testPostExamFunctions(){


        Wait.sleep(60000);
        driver.findElement(By.cssSelector(".fa.fa-file-pdf-o")).click();
        //Wait.waitForElementViability(By.cssSelector(".close"),20);
        //driver.findElement(By.cssSelector(".close")).click();
        //Wait.waitForElementViability(By.cssSelector(".btn.btn-default.btn-sm.btn-scorereport-dl"),20);
        //Wait.sleep(5000);
        //driver.findElement(By.xpath(".//*[@id='tpr-practice']/div[1]/div[2]/div[2]/div/div[1]/span/a")).click();
        Wait.sleep(1000);
        Switch_Windows.windowSwitch(1);
        Assert.assertTrue(driver.findElement(By.id("pageContainer1")).isDisplayed());
        Switch_Windows.windowSwitch(0);
        Wait.waitForElementViability(By.linkText("SAT Math"),20);
        driver.findElement(By.linkText("SAT Math")).click();
        Assert.assertTrue(driver.findElement(By.id("area-math")).getText().contains("Math") );
        Wait.sleep(5000);
        driver.findElement(By.linkText("SAT Verbal")).click();
        Assert.assertTrue(driver.findElement(By.id("area-verbal")).getText().contains("Verbal") );
        Wait.sleep(5000);
        driver.findElement(By.linkText("SAT Essay")).click();
        Assert.assertTrue(driver.findElement(By.id("area-essay")).getText().contains("Essay") );
        Wait.sleep(5000);




    }

}

