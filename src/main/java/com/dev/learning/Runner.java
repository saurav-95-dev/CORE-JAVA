//Queue-Implementation -- Basic:
package com.dev.learning;

class Runner{
    public static void main(String[] args){
        System.out.println("Inside main function:");
        Queue queue = new Queue();
        queue.enQueueu(1);
        queue.enQueueu(2);
        queue.enQueueu(3);
        queue.enQueueu(4);
        queue.show();
        System.out.println();
        System.out.println("Removing--dequeue:");
        System.out.println(queue.deQueue());
        queue.show();
        System.out.println();



    }
}

