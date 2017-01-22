package PracticeExam_Test;

import Drivers.SelDriver;
import com.Practice_Exam.SAT_PracticeExam;
import com.review.MainPage;
import com.review.StudentTools;
import org.junit.Test;

/**
 * Created by Kyle Alex on 1/19/2017.
 */
public class SAT_PracticeExam_Test extends SelDriver {

    @Test

    public void TestSATMockExamPageFunctionality(){

        //first test logs user to account
        driver.get("http://www.princetonreview.com");
        MainPage.signIn("sirkibble1988@gmail.com","Blastingrod");
        StudentTools.launchDashboard("SAT");
        //take user to mock exam page
        SAT_PracticeExam.getToExam();
        //selects exam for testing via index ex A,B,C,D or featured
        SAT_PracticeExam.pickExam("");
        //sets test lengh via desired argument
        SAT_PracticeExam.setTestLength("in half");
        //method leaves test and examines score
        SAT_PracticeExam.exitExamAndDisplayScore();
        //Method exists test post score PDF and test score filters
        SAT_PracticeExam.testPostExamFunctions();



    }

}
