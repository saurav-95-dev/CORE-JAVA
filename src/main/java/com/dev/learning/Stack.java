package com.dev.learning;

public class Stack {
    int top = 0;
    int[] arr = new  int[5];

    public void push(int value){
         arr[top] = value;
         top++;
    }

    public void show(){
          for(int i : arr){
              System.out.print(i + " ");
          }
    }
}