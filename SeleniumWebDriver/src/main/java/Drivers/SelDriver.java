package Drivers;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.Wait;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by E on 12/4/2016.
 */
public class SelDriver extends Global {


    protected static WebDriver driver;

    @Before
    public void setUp(){
        setGlobalVariables();
        if(driverSelection.toUpperCase().equals("CHROME")){
     //  System.setProperty("webdriver.firefox.marionette","C:\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        // launch Firefox and direct it to the Base
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        }else
        {
            System.setProperty("webdriver.firefox.marionette","C:\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();


    }

    public void setGlobalVariables(){
        String name =System.getenv("USERNAME");
        try {
            FileReader fr = new FileReader("C:\\Users\\"+System.getenv("USERNAME")+"\\IdeaProjects\\SeleniumWebDriver\\SeleniumWebDriver\\src\\main\\java\\Drivers\\Init.txt");
            BufferedReader textReader = new BufferedReader(fr);
           String[] lines = new String[2];
            for (int i=0; i < 2; i++) {
                lines[ i ] = textReader.readLine();

            }

            driverSelection = lines[0];
            url = lines[1];

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
