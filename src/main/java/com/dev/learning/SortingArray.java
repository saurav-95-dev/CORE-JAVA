package com.dev.learning;

import java.util.Arrays;

public class SortingArray{
    //this is a non-static method:
    public int[] sortingArray(int[] array){
        for(int i=0;i<1000000;i++){
            Arrays.sort(array);
        }
        return array;
    }
}