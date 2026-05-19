package com.dev.learning;

class Main{
    public static void main(String[] args) {
        String name = new String("material"); //name is a reference variable pointing to the string object.
        //name is a reference variable made in stack which is pointing to string object made in heap memory.
        System.out.println("Hello " + name);
        System.out.println(name.charAt(1));
        //Immutability of Strings :
        String firstName = "Saurabh"; //this will be eligible for garbage collection
        firstName = firstName + " Dev"; //here we are basically creating a new object
        System.out.println(firstName);

        String s1 = "common";
        String s2 = "common";
        System.out.println(s1==s2);
        //There is a special section in heap memory called string constant pool:



    }
}