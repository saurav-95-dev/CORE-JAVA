package com.saurabh.learning;
import static org.junit.jupiter.api.Assertions.assertEquals;


class Test{
    @org.junit.jupiter.api.Test
    void test(){
        assertEquals(6 , 6);
    }

    @org.junit.jupiter.api.Test
    void test2(){
        Shapes s = new Shapes();
        double actualResult = s.squareArea(12);
        double expectedResult = 134.0;
        assertEquals(expectedResult , actualResult , 0.0001 , "Sorry buddy , your tests are failer");
    }


}