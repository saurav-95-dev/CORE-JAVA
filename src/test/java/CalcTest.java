package in.saurabhdev.calc;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    Calc calc;

    @BeforeEach
    void setup() {
        calc = new Calc();
        System.out.println("BeforeEach: New Calc object created");
    }

    @AfterEach
    void teardown() {
        System.out.println("AfterEach: Test finished\n");
    }

    @Test
    void testAdd() {
        assertEquals(30, calc.add(10,20));
    }

    @Test
    void testDivide() {
        assertEquals(5, calc.divide(10,2));
    }
}
