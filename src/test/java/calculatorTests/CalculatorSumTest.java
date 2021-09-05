package calculatorTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class CalculatorSumTest extends Assert {
    private int firstNum;
    private int secondNum;
    private int expectedRes;

    public CalculatorSumTest(int firstNum, int secondNum, int expectedRes) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.expectedRes = expectedRes;
    }

    @Parameterized.Parameters
    public static Iterable<Object> dataForTestSum() {
        return Arrays.asList(new Object[][]{{5, 3, 8}, {81, 81, 162}, {8, 1, 9}});
    }

    @Test
    public void parametryResult() {
        assertEquals(expectedRes, Calculator.getSum(firstNum, secondNum));
    }

    @Test
    public void testCalculatePlus() {
        assertEquals(150, Calculator.getSum(50, 3));
    }
}
