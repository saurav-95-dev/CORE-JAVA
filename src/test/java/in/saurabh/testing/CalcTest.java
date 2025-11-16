package in.saurabh.testing;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @org.junit.jupiter.api.Test
    void test() {
        Calc calc = new Calc();
        assertEquals("ved" , calc.reverseString("dev") );
    }
}