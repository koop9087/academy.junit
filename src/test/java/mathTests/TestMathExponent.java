package mathTests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class TestMathExponent extends Assert {
    @Test
    public void testMathFuncPow() {
        assertEquals(100, Math.getExponent(143));
    }

    @BeforeClass
    public static void printMessBeforeTest() {
        System.out.println("Начался тест экспоненты");
    }

    @AfterClass
    public static void printMessAfterTest() {
        System.out.println("Закончился тест экспоненты");
    }
}
