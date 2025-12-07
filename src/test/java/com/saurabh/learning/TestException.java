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
            for(int ele : newArray){
                System.out.println(ele);
            }
            Assertions.fail();
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");

        }
    }
}