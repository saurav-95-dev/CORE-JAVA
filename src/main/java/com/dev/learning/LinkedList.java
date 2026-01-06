package com.dev.learning;

public class LinkedList {

    Node head;
    Node tail;

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;

        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAtPosition(int data , int position){
        if(head == null){
            if(position == 0){
                insertAtBeginning(data);
            } else {
                System.out.println("Invalid position");
            }

        }
        else{
            Node newNode = new Node(data);
            //inserting at start
            if(position == 0){ //position == 1 means , we want to insert element at 0th index.
                insertAtBeginning(data);
                return;
            }

            //inserting at position:
            Node temp = head;
            int count = 0;
            while(count < position-1){
                temp = temp.next;
                count++;
            }

            newNode.next = temp.next;
            if(temp.next == null){
               tail = newNode;
            }
            temp.next = newNode;


        }

    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
