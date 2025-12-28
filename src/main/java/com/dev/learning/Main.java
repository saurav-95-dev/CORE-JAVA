//Selection-Sort:
//Algo -> The idea is to select the minimum value and place it in its correct position.

package com.dev.learning;

public class Main{
    public static void main(String[] args){
        System.out.println("Selection-sort");
        int[] arr = {3,2,5,4,7,9,8};
        int n = arr.length;
        for(int i=0;i<n;i++){
            int minIndex   = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        for(int num:arr){
            System.out.println(num);
        }
    }

}