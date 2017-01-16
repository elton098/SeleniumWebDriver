package util;

import Drivers.SelDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;
import java.util.ArrayList;

/**
 * Created by Kyle Alex on 1/8/2017.
 */
public class Switch_Windows extends SelDriver {


       //switches windows
    public static void windowSwitch( int windowIndex) {
        driver.switchTo().defaultContent();


        Object[] windows = driver.getWindowHandles().toArray();
        ArrayList<String> windowSwitch = new ArrayList<String>();

        for (int i = 0; i < driver.getWindowHandles().size(); i++)
            windowSwitch.add(windows[i].toString());
        driver.switchTo().window(windowSwitch.get(windowIndex));

    }}