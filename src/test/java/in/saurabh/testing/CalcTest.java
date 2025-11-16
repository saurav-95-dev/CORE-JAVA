package in.saurabh.testing;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc calc = new Calc();
    @org.junit.jupiter.api.Test
    void testReverse1() {

        assertEquals("ved" , calc.reverseString("dev") );
    }
    @org.junit.jupiter.api.Test
    void testReverse2() {

        assertEquals("eman yM" , calc.reverseString("My name") );
    }
}