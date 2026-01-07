package com.dev.learning;

class Runner{
    public static void main(String[] args){
        System.out.println("Inside main method:");
         LinkedList linkedList = new LinkedList();
         linkedList.insertAtHead(0);
         linkedList.insertAtHead(1);
         linkedList.insertAtHead(2);
         linkedList.insertAtHead(3);
         linkedList.insertAtHead(4);
         linkedList.printList();
         System.out.println();
         System.out.println("Head is pointing at :" + linkedList.head.data);
         System.out.println("Tail is pointing at :" + linkedList.tail.data);
         linkedList.insertAtTail(5);
         linkedList.insertAtTail(6);
        linkedList.insertAtTail(11);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at :" + linkedList.head.data);
        System.out.println("Tail is pointing at :" + linkedList.tail.data);

    }
}