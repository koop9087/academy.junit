package mathTests;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class TestRunner extends BlockJUnit4ClassRunner {
    private CalculatorTestListener calculatorTestListener;

    public TestRunner(Class<CalculatorTestListener> clz) throws InitializationError {
        super(clz);
        calculatorTestListener = new CalculatorTestListener();
    }

    @Override
    public void run(final RunNotifier notifier) {
        notifier.addFirstListener(calculatorTestListener);
        super.run(notifier);
    }
}
