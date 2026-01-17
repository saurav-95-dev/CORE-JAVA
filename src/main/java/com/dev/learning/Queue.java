package com.dev.learning;

class Queue{
    //Static size/Fixed Sized
    int[] queue  = new int[5];
    int n = queue.length;
    int front;
    int rear;
    int size;
    public void enQueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = data;
        rear = (rear + 1)%n;
        size++;
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int  data = queue[front];
        front =  (front + 1)%n;
        size--;
        return data;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == n;
    }

    public int getSize(){
        return size;
    }

    public void show(){
        for(int i=0;i<size;i++){
            System.out.print(queue[(front + i)%n]+" ");
        }
        System.out.println();
        System.out.println("Elements inside actual array:");
        for(int i : queue){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

}