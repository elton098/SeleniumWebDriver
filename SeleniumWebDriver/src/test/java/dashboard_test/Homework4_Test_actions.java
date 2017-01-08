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
import util.Wait;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Kyle Alex on 1/7/2017.
 */
public class Homework4_Test_actions extends SelDriver {


@Test
    public void testDateManipulator(){

    driver.get("http://www.princetonreview.com");
    MainPage.signIn("sirkibble1988@gmail.com","Blastingrod");
    StudentTools.launchDashboard("SAT");
    String[] testDays = {".//*[@id='testdate-form']/div/div/div[1]/table/tbody/tr[6]/td[3]",
            ".//*[@id='testdate-form']/div/div/div[1]/table/tbody/tr[5]/td[3]",
            ".//*[@id='testdate-form']/div/div/div[1]/table/tbody/tr[3]/td[2]"

    };
    String[] actualDates={"31", "24", "9" };
    WebElement dateConfirm = driver.findElement(By.cssSelector(".form-control.userDetail"));
    for(int i = 0; i< 1; i++){
        driver.findElement(By.cssSelector(".fa.fa-calendar")).click();
        Wait.sleep(3000);
        driver.findElement(By.xpath(testDays[i])).click();
        assertTrue(dateConfirm.getAttribute("value").equalsIgnoreCase("01/"+actualDates[i]+"/2017"));
        Wait.sleep(3000);}


           driver.navigate().refresh();
           driver.findElement(By.cssSelector(".fa.fa-calendar")).click();
           Wait.sleep(3000);
           driver.findElement(By.xpath(".//*[@id='testdate-form']/div/div/div[1]/table/tbody/tr[3]/td[2]")).click();
    WebElement dateConfirm2 = driver.findElement(By.cssSelector(".form-control.userDetail"));
           assertTrue(dateConfirm2.getAttribute("value").equalsIgnoreCase("01/09/2017"));
           Wait.sleep(3000);
}





@Test
public void testSlider() {
    HomePage.getToSAT();
    driver.findElement(By.linkText("Target Scores")).click();

    Wait.sleep(3000);

    WebElement readingWritingSlider = driver.findElement(By.cssSelector
            ("#TargetScores_Subjects_1__Score"));
    WebElement mathSlider = driver.findElement(By.id("Math-slider"));
    WebElement mathScoreBox = driver.findElement(By.cssSelector(
            "#TargetScores_Subjects_0__Score"));


    Actions sliderActions = new Actions(driver);
    readingWritingSlider.clear();
    sliderActions.moveToElement(readingWritingSlider).click().sendKeys("250");
    sliderActions.moveToElement(mathSlider).moveByOffset(220, 0).click();
    sliderActions.perform();
    Assert.assertTrue(readingWritingSlider.getAttribute("value").equalsIgnoreCase("250"));
    Assert.assertTrue(mathScoreBox.getAttribute("value").equalsIgnoreCase("800"));
    readingWritingSlider.submit();
}


@Test
    public void schoolSelector() {

    HomePage.getToSAT();
    driver.findElement(By.linkText(("Target Schools"))).click();
    List<WebElement> schoolListing = driver.findElements(By.cssSelector("h"));
    //if (schoolListing.get(0).isDisplayed()) {
        for (int i = 0; i < schoolListing.size(); i++) {

            System.out.println(schoolListing.get(i).getText());
        }


    }


}


















