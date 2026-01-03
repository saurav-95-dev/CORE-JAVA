package com.dev.learning;
//Algo -> The idea is to check the adjacent elements and do swapping .
//-> After each round, largest element will be in the correct position.
class Main{
    public static void main(String[] args){
        System.out.println("Bubble sort:");
        //Eg -> {2,1,4,3,5,6,9,7}
        int[] arr = {2,1,4,3,5,6,9,7};
        int n = arr.length;
        for(int i=0;i<n-1;i++){//Outer loop denotes number of rounds
            boolean flag = false;
            for(int j=0;j<n-i-1;j++){
                //inner loop is to traverse through entire array and do processing for the current round.
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}