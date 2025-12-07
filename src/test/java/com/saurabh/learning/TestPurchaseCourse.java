package com.saurabh.learning;

import com.dev.learning.JavaCourse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class TestPurchaseCourse{
    @Test
    void testPurchaseCourse(){
        PurchaseCourse pc = new PurchaseCourse();
        boolean status = pc.purchaseCourse(new JavaCourse());
        Assertions.assertTrue(status , "oops , test is failed");
    }
}