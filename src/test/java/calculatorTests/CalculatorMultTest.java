package calculatorTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class CalculatorMultTest extends Assert {
    private int firstNum;
    private int secondNum;
    private int expectedRes;

    public CalculatorMultTest(int firstNum, int secondNum, int expectedRes) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.expectedRes = expectedRes;
    }

    @Parameterized.Parameters
    public static Iterable<Object> dataForTestSum() {
        return Arrays.asList(new Object[][]{{5, 3, 15}, {4, 5, 20}, {6, 2, 12}});
    }

    @Test
    public void parametryResult() {
        assertEquals(expectedRes, Calculator.getMultiple(firstNum, secondNum));
    }

    @Test
    public void testCalcMultiply() {
        assertEquals(10, Calculator.getMultiple(5, 2));
    }
}
