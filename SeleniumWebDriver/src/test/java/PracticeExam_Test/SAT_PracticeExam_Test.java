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

    public void testhomepage(){
        driver.get("http://www.princetonreview.com");
        MainPage.signIn("sirkibble1988@gmail.com","Blastingrod");
        StudentTools.launchDashboard("SAT");
        SAT_PracticeExam.getToExam();
        SAT_PracticeExam.pickExam("");
        SAT_PracticeExam.setTestLength("in half");
        SAT_PracticeExam.exitExamAndDisplayScore();
        SAT_PracticeExam.testPostExamFunctions();


    }

}
