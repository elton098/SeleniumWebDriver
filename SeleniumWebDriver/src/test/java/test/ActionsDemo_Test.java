package test;

import Drivers.SelDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by E on 12/23/2016.
 */
public class ActionsDemo_Test extends SelDriver{




    @Test
    public  void showSelectableAction(){
        driver.get("file://C://8850OS_Code//Chapter 2//HTML/selectable.html");
        WebElement one = driver.findElement(By.name("one"));
        WebElement three = driver.findElement(By.name("three"));
        WebElement five = driver.findElement(By.name("five"));
// Add all the actions into the ActionsDemo_Test builder.
        Actions builder = new Actions(driver);
        builder.keyDown(Keys.CONTROL)
                .click(one)
                .click(three)
                .click(five)
                .keyUp(Keys.CONTROL);
// Generate the composite action.
        Action compositeAction = builder.build();
// Perform the composite action.
        compositeAction.perform();

    }
        @Test
        public  void moveByOffSet() {
        driver.get("file://C://8850OS_Code//Chapter 2//HTML/selectable.html");

        WebElement three = driver.findElement(By.name("three"));
        System.out.println("X coordinate: "+three.getLocation().getX()+1+" Y coordinate: "+three.getLocation().getY()+1);
        Actions builder = new Actions(driver);
            builder.moveByOffset(three.getLocation().getX()+1, three.getLocation().getY()+1).click();
        builder.perform();
            //verify 3 exits
           // assertTrue(three.isDisplayed());
            //verify highlight exist
            assertTrue(driver.findElement(By.cssSelector(".ui-state-default.ui-selectee.ui-selected")).isDisplayed());

            //verify that highlighted text is 3 the one that was clicked
            String highlightedTxt = driver.findElement(By.cssSelector(".ui-state-default.ui-selectee.ui-selected")).getText();
            //assertFalse(!three.isDisplayed());
            assertEquals("3",highlightedTxt);
    }

    @Test
    public  void clickAndHold() {
        driver.get("file://C://8850OS_Code//Chapter 2//HTML/sortable.html");

        WebElement three = driver.findElement(By.name("three"));
        Actions builder = new Actions(driver);
//Move tile3 to the position of tile2
        builder.clickAndHold(three)
                .moveByOffset(120, 0)
                .release()
                .perform();
    }
    }
