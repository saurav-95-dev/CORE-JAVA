//Static-Circular-Queue-Implementation:
package com.dev.learning;

public class Runner{
    public static void main(String[] args){
        System.out.println("Static-Circular-Queue-Implementation");
        System.out.println();
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        System.out.println("Elements after 6 enQueue():");
        queue.show();
        System.out.println();
        System.out.println("Elements after 1 deQueue()-> " + queue.deQueue());
        queue.enQueue(6);
        System.out.println("Elements after one enQueue() again:");
        queue.show();

    }
}