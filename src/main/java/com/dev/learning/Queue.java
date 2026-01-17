package com.dev.learning;

class Queue{
    //Static size/Fixed Sized
    int[] queue  = new int[5];
    int front;
    int rear;
    int size;
    public void enQueue(int data){
        queue[rear] = data;
        rear++;
        size++;
    }

    public int deQueue(){
        int  data = queue[front];
        front++;
        size--;
        return data;
    }

    public void show(){
        for(int i=0;i<size;i++){
            System.out.print(queue[front + i]+" ");
        }
    }

}