package com.dev.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class TestBeforeAfter {

    Shapes s = new Shapes();
    @Test
    void testSquareArea() {
        Assertions.assertEquals(78.5, s.squareArea(5));
    }
    @Test
    void testCircleArea() {

    }
}