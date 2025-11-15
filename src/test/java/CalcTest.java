package in.saurabhdev.calc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void testAdd() {
        Calc c = new Calc();
        int result = c.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    void testDivide() {
        Calc c = new Calc();
        int result = c.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    void testDivideByZero() {
        Calc c = new Calc();
        assertThrows(ArithmeticException.class, () -> c.divide(10, 0));
    }
}
