package com.dev.learning;
//Algo ->
/*The Idea is to start traversing from the 2nd idx & check all the
prev items .If they are greater than the current value, then first store the current value
& shift all the prior elements to right & then place current in its
correct position.*/

class Main{
    public static void main(String[] args){
        System.out.println("Insertion sort:");
        //Eg -> {2,1,4,3,5,6,9,7}
        int[] arr = {2,1,4,3,5,6,9,7,-1,0,1};
        int n = arr.length;
        //No swapping is required:
        for(int i = 1; i < n; i++){
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}