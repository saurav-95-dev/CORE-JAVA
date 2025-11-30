package com.saurabh.learning;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest{

    ReverseString rs = new ReverseString();
    @org.junit.jupiter.api.Test
    void reverseString() {
        String actualResult = rs.reverseString("dev");
        String expectedResult = "ved";
        assertEquals(expectedResult, actualResult);

    }
}