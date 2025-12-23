package com.dev.learning;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TestingPerformance{
     SortingArray sa = new SortingArray();
     @Test
    void testSortingArray(){
         int[] unsorted = {2,1,4,3,8,0};
         assertTimeout(Duration.ofMillis(100) , ()->{sa.sortingArray(unsorted);} , "can't be done in this time-limit");
     }
}