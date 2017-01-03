package dashboard_test;

import Drivers.SelDriver;
import com.review.StudentTools;
import com.review.MainPage;
import org.junit.Test;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by E on 1/3/2017.
 */
public class HomePage_Test extends SelDriver{

    //Test that user can launch dashboard
    @Test
    public void testDashboardLaunch(){
        driver.get("http://www.princetonreview.com");
        MainPage.signIn("sirkibble1988@gmail.com","Blastingrod");
        StudentTools.launchDashboard("SAT");
        assertTrue(driver.getCurrentUrl().contains("dashboard.princetonreview"));

    }
}
