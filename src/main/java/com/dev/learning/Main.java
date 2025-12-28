package com.dev.learning;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,4,3,1,0,7,9,8,-1,0};
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            boolean flag = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }

            // improvement: stop if already sorted
            if (!flag) break;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
