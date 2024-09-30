

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.swe.assignment10.Calculator;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals("2 + 3 should equal 5", 5, result);
    }
}
