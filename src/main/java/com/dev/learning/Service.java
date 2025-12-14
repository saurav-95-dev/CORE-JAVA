package com.dev.learning;
public class Service {
    public void validateInput(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed.");
        }
        // other logic
    }
}
