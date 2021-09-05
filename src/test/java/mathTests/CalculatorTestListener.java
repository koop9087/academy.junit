package mathTests;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {

    @Override
    public void testRunStarted(Description description) {
        System.out.println("Тесты выполняются " + description.testCount());
    }

    @Override
    public void testRunFinished(Result result) {
        System.out.println("Тесты закончили" + result.getRunCount());
    }

    @Override
    public void testFailure(Failure failure) {
        System.out.println("Тест провален : " + failure.getException());
    }
}
