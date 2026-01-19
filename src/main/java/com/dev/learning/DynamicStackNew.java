package com.dev.learning;

public class DynamicStackNew {

    int capacity = 5;
    final int MIN_CAPACITY = 5;
    int top = 0;
    int[] arr = new int[capacity];

    public void push(int data){
        if(isFull()){
            expand();
        }
        arr[top++] = data;
    }

    private void expand(){
        capacity *= 2;
        int[] newArr = new int[capacity];
        System.arraycopy(arr, 0, newArr, 0, top);
        arr = newArr;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        int data = arr[--top];
        arr[top] = 0;

        // shrink AFTER pop
        if(top <= capacity / 4 && capacity > MIN_CAPACITY){
            shrink();
        }

        return data;
    }

    private void shrink(){
        capacity /= 2;
        int[] newArr = new int[capacity];
        System.arraycopy(arr, 0, newArr, 0, top);
        arr = newArr;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top - 1];
    }

    public int getSize(){
        return top;
    }

    public int getCapacity(){
        return capacity;
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
