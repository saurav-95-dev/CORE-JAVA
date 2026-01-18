//Dynamic-Circular-Queue-Implementation:
package com.dev.learning;

public class Runner{
    public static void main(String[] args){
        System.out.println("Static-Circular-Queue-Implementation");
        System.out.println();
        DynamicCircularQueue queue = new  DynamicCircularQueue();
        System.out.println("Empty Status:" + queue.isEmpty());
        System.out.println("Full Status:" + queue.isFull());
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        System.out.println("Elements after 5 enQueue():");
        System.out.println("Empty Status:" + queue.isEmpty());
        System.out.println("Full Status:" + queue.isFull());
        queue.show();
        System.out.println();
        System.out.println("Elements after 1 deQueue()-> " + queue.deQueue());
        System.out.println("Empty Status:" + queue.isEmpty());
        System.out.println("Full Status:" + queue.isFull());
        System.out.println("Boundary element added--------------");
        queue.enQueue(6);
        System.out.println("Elements after one enQueue() again:");
        queue.show();
        System.out.println("Empty Status:" + queue.isEmpty());
        System.out.println("Full Status:" + queue.isFull());
        queue.enQueue(7);
        System.out.println("Elements after inserting 7:");
        queue.show();
        System.out.println("Empty Status:" + queue.isEmpty());
        System.out.println("Full Status:" + queue.isFull());


    }
}