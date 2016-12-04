import org.junit.Test;

/**
 * Created by E on 12/4/2016.
 */
public class Demo {

    @Test
    public void RunDemoKyle1()  {

        int lenght = 30;
        int width = 5;

        System.out.println("The area is "+ lenght*width);







    }


    @Test
    public void RunDemoKyle2() {

        int[] testAverage = new int[]{80, 90, 95, 77, 60,};
        int accum = 0;
        for (int i = 0; i < testAverage.length; i++) {

            accum += testAverage[i];
        }
        System.out.println("The average is " + accum/testAverage.length);}}







