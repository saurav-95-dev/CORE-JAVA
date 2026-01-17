package com.dev.learning;

class Queue{
    //Static size/Fixed Sized
    int[] queue  = new int[5];
    int n = queue.length;
    int front;
    int rear;
    int size;
    public void enQueue(int data){
        queue[rear] = data;
        rear = (rear + 1)%n;
        size++;
    }

    public int deQueue(){
        int  data = queue[front];
        front =  (front + 1)%n;
        size--;
        return data;
    }

    public void show(){
        for(int i=0;i<size;i++){
            System.out.print(queue[(front + i)%n]+" ");
            //0+1 , 1+1 , 1+2 , 1+3 , 1+4 ->5
        }
        System.out.println();
        System.out.println("Elements inside actual array:");
        for(int i : queue){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

}