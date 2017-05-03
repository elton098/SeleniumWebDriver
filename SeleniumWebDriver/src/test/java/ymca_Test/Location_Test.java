package ymca_Test;
import Drivers.SelDriver;

import org.apache.xerces.impl.dv.xs.YearMonthDV;
import org.junit.Assert;
import org.junit.Test;
import YMCA.YmcaLocation;

/**
 * Created by Kyle Alex on 5/1/2017.
 */
public class Location_Test extends SelDriver {

    @Test
//Test search functionality for finding closest gym to user being myself in this case
    public void testLocationsSearchOnPage(){
        String desiredLocation = "Flatbush";
        YmcaLocation.findLocationOnPage(desiredLocation);
        Assert.assertTrue(driver.getCurrentUrl().contains(desiredLocation.toLowerCase()));

        YmcaLocation.findLocationOnPage("11210");
        Assert.assertTrue(driver.getCurrentUrl().contains(desiredLocation.toLowerCase()));

        YmcaLocation.findLocationFrontPage(desiredLocation);
        Assert.assertTrue(driver.getCurrentUrl().contains(desiredLocation.toLowerCase()));


    }








    }







