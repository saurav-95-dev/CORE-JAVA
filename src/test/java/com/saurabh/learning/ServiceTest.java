package com.saurabh.learning;

import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

public class ServiceTest{

    @Test
    public void shouldThrowArithmeticExceptionAndCheckMessage() {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(10, 0);
            fail("Expected an ArithmeticException to be thrown"); // Fails if no exception is thrown
        } catch (ArithmeticException e) {
            // Test passes if exception is caught, and we can verify its message
            assertEquals("Division by zero is not allowed", e.getMessage());
        }
    }
}
