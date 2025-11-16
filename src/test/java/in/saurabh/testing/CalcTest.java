package in.saurabh.testing;

import junit.framework.TestCase;

public class CalcTest extends TestCase {

    public void testDivide() {
        Calc calc = new Calc();
        int actualResult = calc.divide(12,6);
        int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }
}