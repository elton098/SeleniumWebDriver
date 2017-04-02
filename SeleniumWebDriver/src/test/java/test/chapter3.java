package test;

import Drivers.SelDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.Wait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by E on 12/29/2016.
 */
public class chapter3 extends SelDriver {

    @Test
    public void switchingWindows() {
        driver.get("file://C://8850OS_Code//Chapter 3//HTML/Window.html");
        // String window1 = driver.getWindowHandle();
        //System.out.println("First Window Handle is: "+window1);
        WebElement link = driver.findElement(By.linkText("Google Search"));
        Wait.sleep(3500);
        link.click();
        //String window2 = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        String window1 = windows.iterator().next();
        String window2 = windows.iterator().next();
        System.out.println("Second Window Handle is: " + window2);
        System.out.println("Number of Window Handles so for: "
                + driver.getWindowHandles().size());
        driver.switchTo().window(window1);
        Wait.sleep(4500);
        driver.switchTo().window(window2);
        Wait.sleep(3500);

    }

    @Test
    public void SwitchBetweenFrames() {

        driver.get("file://C://8850OS_Code//Chapter 3//HTML/Frames.html");
        driver.switchTo().frame(0);
        driver.findElement(By.name("1")).sendKeys("I'm Frame One");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        driver.findElement(By.name("2")).sendKeys("I'm Frame Two");
    }


    @Test
    public void alertDemo() {
        driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
        Wait.waitForElementVisibility(By.cssSelector(".cp-info-bar-msg.cp_responsive>span"),5);
        driver.findElement(By.cssSelector(".ib-img-default")).click();
        driver.findElement(By.cssSelector("#content>p>button")).click();
        driver.switchTo().alert().accept();


    }

    @Test
    public void ImplicitWaitTime() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
    }
    @Test
    public void TakesScreenShotExample(){

        //driver.get("http://www.packtpub.com/");
        // File scrFile = ((TakeScreenShot)driver).getScreenshotAs(OutputType.FILE);
        //  System.out.println(scrFile.getAbsolutePath());
    }
}



