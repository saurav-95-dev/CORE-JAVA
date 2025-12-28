//Selection-sort :
package com.dev.learning;

public class Main{
    public static void main(String[] args) {
        System.out.println("Selection sort");
        int[] arr = {1,2,5,4,8,6,0,-1,-1,5,1};
        //{0,1,2,5,4,7,6}
        int n = arr.length;
        for(int i=0;i<n;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }

            //After this loop , minIndex has the index of minimum value in the array.
            if(minIndex!=i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}