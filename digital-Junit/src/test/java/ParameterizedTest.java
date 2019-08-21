import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class) // 测试类必须使用@RunWith注释，并且要把Parameterized类作为它的参数，JUnit测试运行期
public class ParameterizedTest {

    // 必须声明测试中所使用的实例变量
    private int expected;
    private int valueOne;
    private int valueTwo;

    // 提供一个用@Parameters注释的方法
    @Parameterized.Parameters
    /* 方法的签名必须是@Parameters public static java.util.Collections，无任何参数
    Collections元素必须是相同长度的数组，且数组长度必须与唯一的公共构造函数的参数数量相匹配
    */
    public static Collection getTestParameters()
    {
        return Arrays.asList(new Integer[][]{
                        {2,1,1},
                        {3,2,1},
                        {4,3,1}
                });
    }

    // 构造函数
    public ParameterizedTest(int expected, int valueOne, int valueTwo)
    {
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Test
    public void sum()
    {
        Calcutor calc = new Calcutor();
        assertEquals(expected, calc.add(valueOne, valueTwo));
    }
}