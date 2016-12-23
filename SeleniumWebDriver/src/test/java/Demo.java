import Drivers.SelDriver;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by E on 12/4/2016.
 */
public class Demo extends SelDriver {

    @Test
    public void RunDemo() throws InterruptedException {

            // launch Firefox and direct it to the Base
        driver.get("http://www.google.com");
        driver.findElement(By.id("lst-ib")).sendKeys("Elton Eze");
        driver.findElement(By.id("lst-ib")).submit();

    }


    @Test
    public void RunDemo3() throws InterruptedException {

        // launch Firefox and direct it to the Base URL



    }


}
