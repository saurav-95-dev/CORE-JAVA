package in.saurabh.testing;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @org.junit.jupiter.api.Test
    void divide() {
        Calc calc = new Calc();
        assertEquals(5, calc.divide(10, 2));
    }
}