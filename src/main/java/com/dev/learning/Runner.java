package com.dev.learning;

import java.util.LinkedList;

class Runner{
    public static void main(String[] args){
        System.out.println("Inside main method:");
         LinkedList linkedList = new LinkedList();
         linkedList.insertAtHead(0);
         linkedList.insertAtHead(1);
         linkedList.insertAtHead(2);
         linkedList.insertAtHead(3);
         linkedList.printList();
         System.out.println("Head is pointing at :" + head.data);
         System.out.println("Tail is pointing at :" + tail.data);


    }
}