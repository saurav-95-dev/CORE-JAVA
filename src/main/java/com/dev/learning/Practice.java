package com.dev.learning;

import java.util.Arrays;

public class Practice{
    public static void main(String[] args){
        //Linear search :
        int[] arr = new int[10000];
        int target = 900;
        //Object creation:
        Practice p = new Practice();
        int index1 = p.binarySearch(arr, target);
        int index2 = p.linearSearch(arr , target);

        if(index1 != -1 || index2 != -1){
            System.out.println("Element found at index :" + index1);
        }
        else{
            System.out.println("Element not found");
        }
    }
    int step1 = 0;

    public int linearSearch(int[] arr , int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println("Number of steps in linear:" + step1);
                return i;
            }
            step1++;

        }
        System.out.println("Number of steps in linear:" + step1);
        return -1;
    }
    int step2 = 0;
    public int binarySearch(int[] arr , int target){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
             if(arr[mid] == target){
                 System.out.println("Number of steps in binary:" + step2);
                 return mid;
             }
             else if(arr[mid] > target){
                 end =  mid-1;
             }
             else if(arr[mid] < target){
                 start = mid+1;
             }
             step2++;
        }
        System.out.println("Number of steps in binary:" + step2);
        return -1;
    }
}