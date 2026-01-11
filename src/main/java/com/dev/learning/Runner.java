package com.dev.learning;

public class Runner{
    public static void main(String[] args){
        System.out.println("Inside main function:");
        //creating instance of LinkedList class
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtHead(0);
        linkedList.printList();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
    }
}