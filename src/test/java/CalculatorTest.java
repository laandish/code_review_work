import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void add() {
        assertEquals(15, calculator.add(7, 8));
        assertEquals(-2, calculator.add(3, -5));
        assertEquals(-10, calculator.add(-4, -6));
    }

    @Test
    public void dif() {
        assertEquals(5, calculator.dif(10, 5));
        assertEquals(-8, calculator.dif(2, 10));
        assertEquals(0, calculator.dif(15, 15));
    }

    @Test
    public void times() {
        assertEquals(24, calculator.times(6, 4));
        assertEquals(0, calculator.times(0, 8));
        assertEquals(-21, calculator.times(7, -3));
    }

    @Test
    public void div() {
        assertEquals(4, calculator.div(12, 3));
        assertEquals(3, calculator.div(15, 5));
        assertEquals(-5, calculator.div(20, -4));
    }

    @Test
    public void testDivByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.div(10, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }


    @Test
    public void solver() {
        // Уравнение: (3x*x - 2x + 5) для x = 3
        assertEquals(26, calculator.solver());
    }
}