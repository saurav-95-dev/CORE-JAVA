package com.dev.learning;

import java.util.Arrays;

public class SortingArray{
    //This is a function which will return an array:
    //This is a non-static method
    public int[] sortingArray(int[] array){
        for(int i=0;i<10000000;i++){
            Arrays.sort(array);
        }
        return array;
    }
}