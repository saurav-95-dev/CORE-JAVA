package com.dev.learning;

import java.util.Arrays;

public class Practice{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        System.out.println("Before sorting:");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        bubbleSort(arr , n);
        System.out.println("After sorting:");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void bubbleSort(int[] arr, int n){

         int temp = 0;
         //outer loop is to track number of rounds.
         for(int i = 0; i<=n-1;i++){
             int flag = 0;
             for(int j = 0;j<n-i-1;j++){
                 if(arr[j]>arr[j+1]){
                     temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                     flag = 1;
                 }
             }
             if(flag==0){
                 System.out.println("Number of rounds taken:" + i);
                 break;
             }

         }
    }
}