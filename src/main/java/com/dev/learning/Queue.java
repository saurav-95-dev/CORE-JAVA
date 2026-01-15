package com.dev.learning;

public class Queue{
    int queue[]  = new int[5];
    int size;
    int front;
    int rear;
    public void enQueueu(int data){
        queue[rear] = data;
        rear++;
        size++;
    }
    public int deQueue(){
        int data = queue[front];
        front++;
        size--;
        return data;
    }

    public void show(){
        System.out.println("Elements:");
//        for(int i=0;i<size;i++){
//            System.out.print(queue[front + i]+" ");
//        }
        for(int i : queue){
            System.out.print(i + " ");
        }
    }


}