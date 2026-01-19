package com.dev.learning;

public class Stack{
    int[] arr = new int[5];
    int top  = 0;

    public void push(int data){
        arr[top] = data;
        top++;
    }
    public int pop(){
        top--;
        int data =  arr[top];
        arr[top] = 0;
        return data;
    }
    public void show(){
         for(int i : arr){
             System.out.print(i + " ");
         }
        System.out.println();
    }
}