package com.dev.learning;

public class DynamicStack {
    int capacity  = 2;
    int[] arr = new int[capacity];
    int top = 0;

    public void push(int value){
        if(size() == capacity){
            expand();
        }
            arr[top] = value;
            top++;
    }

    private void expand(){
        int l = size();
        int[] newStack = new int[capacity*2];
        System.arraycopy(arr, 0, newStack, 0, l);
        arr = newStack;
        //update capacity to double:
        capacity  *= 2;

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