package com.saurabh.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysTest {
    @Test
    void testArrays() {
        int [] expected = {1,2,3,4,5};
        int [] actual = {1,2,3,4,5};
        assertArrayEquals(expected, actual);
    }
}