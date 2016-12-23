package Drivers;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by E on 12/4/2016.
 */
public class SelDriver {


    protected static WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.firefox.marionette","C:\\drivers\\geckodriver.exe");
        // launch Firefox and direct it to the Base
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }


    @After

    public void tearDown(){
       try {
           Thread.sleep(2000);
           driver.quit();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
