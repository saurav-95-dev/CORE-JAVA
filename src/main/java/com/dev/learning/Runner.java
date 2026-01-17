//Queue-Implementation :
package com.dev.learning;

class Runner{
    public static void main(String[] args){
        System.out.println("Queue-Implementation:");
        System.out.println();
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        System.out.println("Current Elements Inside queue after 4 enQueue():");
        queue.show();
        System.out.println();
        System.out.println("Deleting one element-deQueue():");
        System.out.println(queue.deQueue());
        System.out.println("Current Elements inside queue after one deQueue():");
        queue.show();
        queue.enQueue(5);
        queue.enQueue(6);
        System.out.println("Current Elements inside queue after again 2 enQueue():");
        queue.show();


    }
}