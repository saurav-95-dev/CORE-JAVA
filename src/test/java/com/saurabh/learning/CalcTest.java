//To Run JUNIT-TESTS without IDE via CLI --> mvn clean install / mvn test
package com.saurabh.learning;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
    @Test
    public void test_divide() {
        Calc calc = new Calc();
        int actualResult = calc.divide(10, 2);
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }
}