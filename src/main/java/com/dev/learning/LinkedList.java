package com.dev.learning;

public class LinkedList{
    Node head = null;
    Node tail = null;

    public void insertAtHead(int data){
        //create a newNode for incoming data:
        Node newNode = new Node(data);
        if(head == null || tail == null){ //empty list condition
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}