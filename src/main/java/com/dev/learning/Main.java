package com.dev.learning;
//Algo -> The idea is to identify the curr minimum from the array and do swaping with the assumed minimum.
//After each inner loop processing , one element will be placed a correct position from the left side onwards.
class Main{
    public static void main(String[] args){
        System.out.println("Selection sort:");
        //Eg -> {2,1,4,3,5,6,9,7}
        int[] arr = {2,1,4,3,5,6,9,7,-1,0,1};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex  = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}