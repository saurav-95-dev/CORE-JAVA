package com.dev.learning;

public class Runner{
    public static void main(String[] args){
        System.out.println("Inside main function:");
        //creating instance of LinkedList class
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtHead(0);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        linkedList.insertAtHead(1);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(3);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        linkedList.insertAtTail(11);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        linkedList.insertAtTail(12);
        linkedList.insertAtTail(13);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        linkedList.insertAtIndex(2,22);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        linkedList.insertAtIndex(0,88);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        linkedList.insertAtIndex(8,8);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        linkedList.insertAtIndex(10,33);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        System.out.println();
        //Deletion:
        System.out.println("Deletion");
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        System.out.println("After deletion of 3rd index element");
        linkedList.deleteTargetNode(3);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        System.out.println("After deletion of 9th index element");
        linkedList.deleteTargetNode(9);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);


    }
}