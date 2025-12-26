//Insertion-sort:
//Idea is to take the element and insert it in its right position.

package com.dev.learning;

public class Main{
    public static void main(String[] args){
        //Eg - {8,2,4,1,3}
        //Eg - {1,2,3,4,5}
        //Eg - {1,2,4,0,9,6}
        int[] arr = {1,2,4,0,9,6};
        int n = arr.length;
        for(int i=1;i<n;i++){
            int curr = arr[i]; //storing current item that has to be compared to previous items
            int j = i-1; //starting from the previous item
            while(j>=0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}