package com.dev.learning;

public class Runner{
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtBeginning(0);
        linkedList.insertAtBeginning(1);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(3);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        linkedList.insertAtEnd(11);
        linkedList.insertAtEnd(12);
        linkedList.insertAtEnd(13);
        linkedList.insertAtEnd(14);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        linkedList.insertAtPosition(22,4);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        linkedList.insertAtPosition(28,9);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);

        linkedList.insertAtPosition(8,0);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        //deletion of a target node -- from Middle/Front/End
        linkedList.deletionOfTargetNode(2);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        linkedList.deletionOfTargetNode(8);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
        linkedList.deletionOfTargetNode(28);
        linkedList.printList();
        System.out.println();
        System.out.println("Head is pointing at:" + linkedList.head.data);
        System.out.println("Tail is pointing at:" + linkedList.tail.data);
    }
}