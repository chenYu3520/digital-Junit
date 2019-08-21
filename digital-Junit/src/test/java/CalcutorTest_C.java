import org.junit.Test;
import org.omg.CORBA.Object;

import java.lang.reflect.Array;
import java.util.Map;

import static org.junit.Assert.*;

public class CalcutorTest_C {
    @Test
    public void testAdd()
    {
        Calcutor calcutor = new Calcutor();
        double result = calcutor.add(10, 50);
        assertEquals(60, result, 0);
    }

    @Test
    public void testAdd1()
    {
        Calcutor calcutor = new Calcutor();
        double result = calcutor.add(10, 50);
        assertEquals(50, result, 10);
        assertEquals(70, result, 10);
        assertArrayEquals("message",new int[2], new int[3]); // 断言数组
        assertEquals("message", new int[3], "123"); // 断言对象
        assertTrue("message", "123" == "456"); // 断言条件为真
        assertNotNull("message", "123"); // 断言不为空
    }
}