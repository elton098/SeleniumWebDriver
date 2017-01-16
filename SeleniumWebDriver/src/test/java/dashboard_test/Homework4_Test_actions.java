package dashboard_test;

import Drivers.SelDriver;
import com.dashboard.HomePage;
import com.review.MainPage;
import com.review.StudentTools;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.Switch_Windows;
import util.Wait;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Kyle Alex on 1/7/2017.
 */
public class Homework4_Test_actions extends SelDriver {


@Test
//Test date change
    public void testDateManipulator() {

    driver.get("http://www.princetonreview.com");
    MainPage.signIn("sirkibble1988@gmail.com", "Blastingrod");
    StudentTools.launchDashboard("SAT");


//accepts xpath of date on calender and as well as the actual value of date.
    assertTrue
            (((HomePage.getDates
                    (".//*[@id='testdate-form']/div/div/div[1]/table/tbody/tr[6]"
                            + "/td[3]"))).equalsIgnoreCase("01/31/2017"));




    assertTrue(((HomePage.getDates
            (".//*[@id='testdate-form']/div/div/div[1]/table/tbody/tr[5]/td[3]")))
            .equalsIgnoreCase("01/24/2017"));




}




@Test
public void testSlider() {
 //Test slider actions for setting values within projected score via input
    driver.get("http://www.princetonreview.com");
    MainPage.signIn("sirkibble1988@gmail.com", "Blastingrod");
    StudentTools.launchDashboard("SAT");
    HomePage.clickTestModo();
    assertTrue
            (HomePage.setScoreValueInBox("#TargetScores_Subjects_1__Score", "250")
                    .equalsIgnoreCase("250"));
    //sets math slider to max
    assertTrue
            (HomePage.setSliderValueToMax
                    ("#TargetScores_Subjects_0__Score").equalsIgnoreCase("800"));


}

@Test
    public void schoolSelector() {
    //Test adds both Harvard College and Yale University as desired schools
    HomePage.SchoolSelector();












}


}


















