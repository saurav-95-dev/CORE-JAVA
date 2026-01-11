package com.dev.learning;

public class LinkedList{
    Node head = null;
    Node tail = null;

    public void insertAtHead(int data){
        //create a newNode for incoming data:
        Node newNode = new Node(data);
        if(head == null){ //empty list condition
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
            tail.next = newNode;
            tail = newNode; //update tail
        }
    }

    public void insertAtIndex(int index , int value){
        if(index < 0 ){
            System.out.println("Index out of bounds..!");
            return;
        }
        if(head == null){ //empty list
            if(index == 0){
                insertAtHead(value);
            } else {
                System.out.println("Index out of bounds!");
            }
            return;
        }

        if(index == 0){
            insertAtHead(value);
            return;
        }

            Node current = head;
            int count = 0;
            while(count < index-1 && current != null){
                current = current.next;
                count++;
            }
            if(current == null){
                System.out.println("Index out of bounds!");
                return;
            }
            Node newNode = new Node(value);
            newNode.next = current.next;
            if(current.next == null){
                tail = newNode;  //handling tail position for insertion at last
            }
            current.next = newNode;

    }

    public void deleteTargetNode(int index){
        if(index < 0){
            System.out.println("Invalid index");
            return;
        }

        if(head == null){
            System.out.println("Oops.. List is empty!");
            return;
        }

        // delete head
        if(index == 0){
            head = head.next;
            if(head == null){
                tail = null;
            }
            return;
        }

          Node prev = null;
          Node curr = head;
          int count = 0;
          while(count < index && curr != null){
              prev = curr;
              curr = curr.next;
              count++;
          }
          if(curr == null){
              System.out.println("Index out of bounds!");
              return;
          }

          prev.next = curr.next;
          if(curr.next == null){
              tail = prev;
          }
          curr.next = null;

    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public int listSize(){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }
}