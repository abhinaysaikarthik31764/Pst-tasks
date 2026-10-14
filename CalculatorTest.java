import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test void testAddition() {
        assertEquals(30, calculator.add(10, 20));
    }

    @Test void testDivision() {
        assertEquals(5.0, calculator.divide(10, 2));
    }

    @Test void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
