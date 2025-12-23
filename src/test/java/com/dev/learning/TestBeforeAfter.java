package com.dev.learning;

import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestBeforeAfter {

    TestBeforeAfter(){
        System.out.println("Constructor executed..");
    }

    Shapes s;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All tests");  //executed only once
    }
    @AfterAll
    static void afterAll() {
        System.out.println("After All tests");
    }
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