package com.dashboard;

import Drivers.SelDriver;
import com.review.MainPage;
import com.review.StudentTools;

/**
 * Created by E on 1/3/2017.
 */
public class HomePage extends SelDriver {
public static void getToSAT(){

    driver.get("http://www.princetonreview.com");
    MainPage.signIn("sirkibble1988@gmail.com","Blastingrod");
    StudentTools.launchDashboard("SAT");

}

public static void launchCalender(){

}


public static void setTestDate(int number){
    launchCalender();

}
}
