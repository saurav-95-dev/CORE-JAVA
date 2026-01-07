package com.dev.learning;

class LinkedList{
    Node head;
    Node tail;

    public void insertAtHead(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
    }
}