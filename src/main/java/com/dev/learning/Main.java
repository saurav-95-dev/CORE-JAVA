package com.dev.learning;

class Main{
    public static void main(String[] args) {
        String name = new String("material"); //name is a reference variable pointing to the string object.
        //name is a reference variable made in stack which is pointing to string object made in heap memory.
        System.out.println("Hello " + name);
        System.out.println(name.charAt(1));

    }
}