package com.dev.learning;

import java.util.Arrays;

public class Practice{
    public static void main(String[] args) {
        int[] arr = {1,5,0,4,-1,11,6,6,0};
        int n = arr.length;
        System.out.println("Before sorting:");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        selectionSort(arr , n);
        System.out.println("After sorting:");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void selectionSort(int[] arr, int n){
        int temp;
        for(int i=0;i<n;i++){
            int minValIndex  = i;
            //from this loop , we find the min value's index
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[minValIndex]){
                    minValIndex = j; //update
                }
            }
            temp = arr[i];
            arr[i] = arr[minValIndex];
            arr[minValIndex] = temp;

        }

    }
}