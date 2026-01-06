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

    public void deletionOfTargetNode(int value){
        //in case of empty list :
        if(head == null){
            System.out.println("Oops ! , List is empty , item can't be deleted.");
            return;
        }
        else{
            Node temp = head;
            Node curr = head.next;
            //deleting starting node :
            if(value == temp.data){
                head = head.next;
                return;
            }
            while(curr.data != value && curr.next != null){
                curr = curr.next;
                temp =  temp.next;
            }
            //after this while loop , curr is pointing at target node that has to be deleted.
            if(curr.next==null){
                tail = temp;
            }
            temp.next = curr.next;
            curr.next = null;

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
