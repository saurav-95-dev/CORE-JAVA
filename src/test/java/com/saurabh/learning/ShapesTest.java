package com.saurabh.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {

    @Test
    void squareArea() {
        Shapes shapes = new Shapes();
        assertEquals(576 , shapes.squareArea(24) , ()->" Square area is wrong");
    }
     @Test
    void circleArea(){
        Shapes shapes = new Shapes();
        assertEquals( 28.26 , shapes.circleArea(3) , 0.001);
    }


}

