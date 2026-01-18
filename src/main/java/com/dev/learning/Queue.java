package com.dev.learning;

public class Queue{
    int[] queue = new int[5];
    int n = queue.length;
    int rear = 0;
    int front = 0;
    int size = 0;

    public void enQueue(int data){
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
        System.out.println("Elements inside queue:" );
        for(int i=0;i<size;i++){
            System.out.print(queue[front + i]+" ");
        }
        System.out.println();
        System.out.println("Current size of queue:"+size);
        System.out.println();
        System.out.println("Elements inside actual array:");
        for(int i : queue){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Current size of actual array:"+queue.length);

    }
}