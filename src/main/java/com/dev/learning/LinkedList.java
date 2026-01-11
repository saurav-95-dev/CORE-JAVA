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

    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head == null && tail==null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode; //update tail
        }
    }

    public void insertAtIndex(int index , int value){
        Node newNode = new Node(value);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        //handle first and last position:
        if(index == 0){
            insertAtHead(value);
            return;
        }
        else{
            Node current = head;
            int count = 0;
            while(count < index-1){
                current = current.next;
                count++;
            }
            newNode.next = current.next;
            current.next = newNode;

        }
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}