package com.dev.learning;

import java.util.LinkedList;

class Runner{
    public static void main(String[] args){
        //inbuilt implementation:
        LinkedList list = new  LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(2,12);
        list.remove(2);
        System.out.println(list);
    }
}