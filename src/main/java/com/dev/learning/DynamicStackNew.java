//Dynamic Stack Implementation:
package com.dev.learning;

public class DynamicStackNew{
    int[] arr = new int[5];
    int capacity = 5;
    int top  = 0;

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full , hence need to call expand()");
            expand();
        }
        arr[top] = data;
        top++;
    }
    public void expand(){
        capacity *= 2;
        int[] newArr = new int[capacity];
        System.arraycopy(arr,0,newArr,0,top);
        arr = newArr;
    }
    public int pop(){
        top--;
        int data =  arr[top];
        arr[top] = 0;
        return data;
    }
    public int peek(){
        return arr[top-1];
    }
    public int getSize(){
        return top;
    }
    public boolean isEmpty(){
        return top == 0;
    }
    public boolean isFull(){
        return top == capacity;
    }
    public void show(){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}