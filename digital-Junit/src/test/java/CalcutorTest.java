import org.junit.Test;

import static org.junit.Assert.*;

public class CalcutorTest {

    public static void main(String[] args) {
        Calcutor calcutor = new Calcutor();

        double result = calcutor.add(10, 50);

        if (result != 60)
        {
            System.out.println("The error result is :" + result);
        }
    }
}