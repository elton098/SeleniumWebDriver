package Flows;

import dashboard_test.HomePage_Test;
import dashboard_test.Homework4_Test_actions;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.chapter3;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        Homework4_Test_actions.class,
        chapter3.class,
        HomePage_Test.class
})



public class Dashboard_flows {
}
