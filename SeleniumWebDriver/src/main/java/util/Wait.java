package util;

import Drivers.SelDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
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
// waits for web element to be visible and sets wait time
  public static void waitForElementViability(By Selection, int waitTimeSeconds ){

     WebDriverWait wait = new WebDriverWait(driver,waitTimeSeconds);

      wait.until(ExpectedConditions.visibilityOfElementLocated(Selection));

  }
}









