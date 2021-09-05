package calculatorTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class CalculatorDivTest extends Assert {
    private int firstNum;
    private int secondNum;
    private int expectedRes;

    public CalculatorDivTest(int firstNum, int secondNum, int expectedRes) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.expectedRes = expectedRes;
    }

    @Parameterized.Parameters
    public static Iterable<Object> dataForTestSum() {
        return Arrays.asList(new Object[][]{{90, 3, 30}, {4, 4, 1}, {30, 10, 3}});
    }

    @Test
    public void parametryResult() {
        assertEquals(expectedRes, Calculator.getDivide(firstNum, secondNum));
    }

    @Test
    public void testCalcDivided() {
        assertEquals(50, Calculator.getDivide(100, 2));
    }
}
