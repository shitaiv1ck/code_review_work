import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-4, 4));
        assertEquals(-10, calculator.add(-3, -7));
    }

    @Test
    void dif() {
        assertEquals(4, calculator.dif(10, 6));
        assertEquals(-5, calculator.dif(3, 8));
        assertEquals(0, calculator.dif(7, 7));
    }

    @Test
    void div() {
        assertEquals(5, calculator.div(20, 4));
        assertEquals(-3, calculator.div(-9, 3));
        assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));
    }

    @Test
    void times() {
        assertEquals(24, calculator.times(4, 6));
        assertEquals(0, calculator.times(15, 0));
        assertEquals(-12, calculator.times(-3, 4));
    }

    @Test
    void solver() {
        assertEquals(8, calculator.solver());
    }
}