//Queue-Implementation -- Basic:
package com.dev.learning;

class Runner{
    public static void main(String[] args){
        System.out.println("Inside main function:");
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.show();
        System.out.println();
        System.out.println("Removing--dequeue:");
        System.out.println(queue.deQueue());
        queue.show();
        System.out.println();



    }
}

