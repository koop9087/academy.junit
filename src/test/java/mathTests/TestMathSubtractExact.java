package mathTests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class TestMathSubtractExact extends Assert {
    @Test
    public void testMathSubExFunc() {
        assertEquals(900, Math.subtractExact(20, 30));
    }

    @BeforeClass
    public static void printMessBeforeTest() {
        System.out.println("Начался тест вычитания");
    }

    @AfterClass
    public static void printMessAfterTest() {
        System.out.println("Закончился тест вычитания");
    }
}
