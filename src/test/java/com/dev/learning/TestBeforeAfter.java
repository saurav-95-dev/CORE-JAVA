package com.dev.learning;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class TestBeforeAfter {
    Shapes s;
    @BeforeEach
    void init(){
        s = new Shapes();
        System.out.println("Before tests");
    }

    @Test
    void testSquareArea() {
        Assertions.assertEquals(25, s.squareArea(5));
        System.out.println("square test running..");
    }
    @Test
    void testCircleArea() {
       Assertions.assertEquals(78.5, s.circleArea(5));
       System.out.println("circle test running..");
    }

    @AfterEach
    void destroy(){
        System.out.println("cleanup ...");
    }
}