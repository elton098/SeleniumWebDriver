import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by E on 12/4/2016.
 */
public class Demo {

    @Test
    public void RunDemo() throws InterruptedException {

        System.setProperty("webdriver.firefox.marionette","C:\\drivers\\geckodriver.exe");
            // launch Firefox and direct it to the Base
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.gmail.com");


    }


    @Test
    public void RunDemo2() throws InterruptedException {

        // launch Firefox and direct it to the Base URL



    }


    @Test
    public void RunDemo3() throws InterruptedException {

        // launch Firefox and direct it to the Base URL



    }


}
