//Dynamic-Circular-Queue-Implementation:
package com.dev.learning;

public class DynamicCircularQueue{
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    //constructor to initialize
    public DynamicCircularQueue(){
        capacity = 5;
        queue = new int[capacity];
        front  = 0;
        rear = 0;
        size = 0;
    }
    public void enQueue(int data){
        if(isFull()){
            System.out.println("Warning .... Queue is full , hence resizing:");
            resize();
        }
            queue[rear % capacity] = data;
            rear++;
            size++;
    }

    public int deQueue(){
        int data=0;
        if(isEmpty()){
            System.out.println("Warning ..Queue is empty");
            return -1;
        }
        else{
            data = queue[front % capacity];
            front++;
            size--;
        }
        return data;
    }

    public void resize(){
        int newCapacity = capacity*2;
        int[] newQueue = new int[newCapacity];
        for(int i = 0; i < size; i++){
            newQueue[i] = queue[(front + i) % capacity];
        }
        queue = newQueue;
        front = 0;
        rear = size;
        capacity = newCapacity;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size == capacity;
    }

    public int getQueueSize(){
        return size;
    }

    public void show(){
        System.out.println("Elements inside queue:" );
        for(int i=0;i<size;i++){
            System.out.print(queue[(front + i)%capacity]+" ");
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