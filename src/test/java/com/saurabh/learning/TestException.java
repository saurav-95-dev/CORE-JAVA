package com.saurabh.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.fail;

public class TestException {
    @Test
    void testException(){
        Exception ex = new Exception();

        try{
            int[] unsortedArray = null;
            int[] newArray = ex.sortArray(unsortedArray);

        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");

        }
    }
}