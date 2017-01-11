package util;

import Drivers.SelDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

/**
 * Created by Kyle Alex on 1/8/2017.
 */
public class Switch_Windows extends SelDriver {




    public static void windowSwitchViaLinkText (WebDriver driver, String args){


        String window1 = driver.getWindowHandle();


        WebElement link = driver.findElement(By.linkText(args));
                link.click();
        Wait.sleep(4000);
        String window2 = driver.getWindowHandle();

        //driver.switchTo().window(window2);






    }




    public static void windowSwitchViaCSS (String arg){


        String window1 = driver.getWindowHandle();


        WebElement link = driver.findElement(By.cssSelector(arg));
        link.click();
        String window2 = driver.getWindowHandle();

}

    public static void windowSwitchViaID (String arg) {


        String window1 = driver.getWindowHandle();


        WebElement link = driver.findElement(By.id(arg));
        link.click();
        String window2 = driver.getWindowHandle();
    }


    public static void windowSwitchViaXpath (String arg){


        String window1 = driver.getWindowHandle();


        WebElement link = driver.findElement(By.xpath(arg));
        link.click();
        String window2 = driver.getWindowHandle();}


    public static void windowSwitchViaClass (String arg){


        String window1 = driver.getWindowHandle();


        WebElement link = driver.findElement(By.className(arg));
        link.click();
        String window2 = driver.getWindowHandle();
    }

    public static void windowSwitchViaPartialLinkText (String arg){


        String window1 = driver.getWindowHandle();


        WebElement link = driver.findElement(By.partialLinkText(arg));
        link.click();
        String window2 = driver.getWindowHandle();
    }



    public static void windowSwitchViaTagName (String arg){


        String window1 = driver.getWindowHandle();


        WebElement link = driver.findElement(By.tagName(arg));
        link.click();
        String window2 = driver.getWindowHandle();}

    public static void windowSwitchViaName (String arg){


        String window1 = driver.getWindowHandle();


        WebElement link = driver.findElement(By.name(arg));
        link.click();
        String window2 = driver.getWindowHandle();
    }
    public static void windowSwitchviaIndex(WebDriver driver, WebElement driverIndex){

        String window3 = driver.getWindowHandle();

        driverIndex.click();

        String window4 = driver.getWindowHandle();
    }




    }

