package com.dev.learning;

class Main{
    public static void main(String[] args) {
        //System.out.println("Inside main function");
        String name = "Saurabh Dev";
        name = name + " appended"; //Here we are basically creating a new object .
        //name variable will in stack will start referring to the new object created in heap with the updated value.
        //the old value of name object now gets eligible for garbage collection.
        System.out.println(name);
        String s1 = "Hi";
        String s2 = "Hi";
        //both s1 and s2 will point to the same address in heap memory under string pool constant.
        System.out.println(s1 == s2);


    }
}