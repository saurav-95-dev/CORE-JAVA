package com.dev.learning;

public class Stack {
    int top = 0;
    int[] arr = new  int[7];

    public void push(int value){
        if(top == arr.length){
            System.out.println("Stack is full");
        }
        else{
            arr[top] = value;
            top++;
        }
    }

    public int pop(){
        int data = 0;
        if(isEmpty()){
            System.out.println("Stack is empty , you cant pop further as the array size is :" + size());
        }
        else{
            top--;
            data =  arr[top];
            arr[top] = 0;

        }
        return data;

    }

    public int peek(){
        return arr[top-1];
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top <= 0;
    }

    public void show(){
          for(int i : arr){
              System.out.print(i + " ");
          }
    }
}