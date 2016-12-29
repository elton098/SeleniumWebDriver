package util;

import Drivers.SelDriver;

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
}
