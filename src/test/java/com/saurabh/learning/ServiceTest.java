package com.saurabh.learning;

import com.dev.learning.Service;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ServiceTest{

    @Test
    public void testValidateInputThrowsException() {
        Service service = new Service();
        try {
            service.validateInput(-1);
            fail("Expected IllegalArgumentException to be thrown"); // Fails if no exception
        } catch (IllegalArgumentException e) {
            // Test passes here
            assertEquals("Negative numbers not allowed.", e.getMessage());
        }
    }
}
