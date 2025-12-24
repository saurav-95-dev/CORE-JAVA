package com.dev.learning;

public class Practice{
    public static void main(String[] args){
        //Linear search :
        int[] arr = {1,3,2,4,5,6,9,7};
        int target =  12;
        Practice p = new Practice();
        int index = p.linearSearch(arr, target);

        if(index != -1){
            System.out.println("Element found at index :" + index);
        }
        else{
            System.out.println("Element not found");
        }
    }

    public int linearSearch(int[] arr , int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}