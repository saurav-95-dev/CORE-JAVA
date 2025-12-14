package com.saurabh.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ServiceTest {

    @Test
    void testValidateInputThrowsException() {
        Service service = new Service();

        // 1. Assert that the specific exception type is thrown
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    // Code that is expected to throw the exception
                    service.validateInput(-1);
                }
        );

        // 2. (Optional) Further assert the exception message
        assertEquals("Negative numbers not allowed.", exception.getMessage());
    }
}
