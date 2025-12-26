//Introduction to Linked-list :
//ARRAY VS LINKED-LIST
//Inbuilt implementation
//Manual implementation
package com.dev.learning;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        //Using inbuilt feature from Collection API - Using linked-list as a class:
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2,12);
        list.remove(4);
        System.out.println(list);
    }
}