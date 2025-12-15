package com.dev.learning;

// Class to be tested
public class Service {
    public int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return numerator / denominator;
    }
}
