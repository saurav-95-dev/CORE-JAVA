//Insertion-sort :
/*Algo ->The Idea is to start traversing from the 2nd index and check all the
previous items . If they are greater than the curr value , then first store the curr value
and shift all the prior elements to right side and then place curr one in its
correct position.
*/

package com.dev.learning;

public class Main{
    public static void main(String[] args){
        System.out.println("Insertion sort:");
        int[] arr = {2,1,4,3,6,7,0,9,1,2,2,0};
        //{1,2,3,4,5,8,6,7,0} -> {1,2,3,4,5,6,8,7,0} -> {1,2,3,4,5,6,7,8,0} -> Final output
        int n = arr.length;
        //We assume first element to be sorted. Thus ,i = 1.
        for(int i = 1;i<n;i++){
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > curr){
                //shift this jth element to the right:
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;

        }

        System.out.println("Sorted array:");
        for(int i:arr){
            System.out.print(i+" ");
        }


    }
}