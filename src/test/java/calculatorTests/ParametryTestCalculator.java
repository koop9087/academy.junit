package calculatorTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParametryTestCalculator extends Assert {
    private int valueOne;
    private int valueTwo;
    private int expectedResult;

    public ParametryTestCalculator(int valueOne, int valueTwo, int expectedResult) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object> dataForTest() {
        return Arrays.asList(new Object[][]{{5, 3, 8}, {81, 81, 162}, {8, 1, 9}});
    }

    @Test
    public void parametrResult() {
        assertEquals(expectedResult, Calculator.getSum(valueOne, valueTwo));
    }
}
