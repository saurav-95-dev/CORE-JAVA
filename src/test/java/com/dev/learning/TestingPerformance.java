package com.dev.learning;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

class TestingPerformance {
    @Test
    void testPerformance() {
        SortingArray array = new SortingArray();
        int[] unsortedArray = {2,3,6,54};
        assertTimeout(Duration.ofMillis(10),()->{array.sortingArray(unsortedArray);});
    }
}