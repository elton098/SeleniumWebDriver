package test.I;

import Drivers.SelDriver;
import Drivers.SelDriver;
import com.review.StudentTools;
import com.review.MainPage;
import org.junit.Test;
import org.openqa.selenium.By;
import util.Wait;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Kyle Alex on 1/21/2017.
 */
public class E_test extends SelDriver {

    @Test
    public void ieTest(){

        driver.navigate().to("https://www.google.com/");
        Wait.sleep(10000);


    }
}
