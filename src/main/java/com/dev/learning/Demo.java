//REV-String :
//Note : Strings --> Immutable in java by default

package com.dev.learning;

public class Demo{
    public static void main(String[] args) {
        System.out.println("Inside main method:");
        String s = new String("Hello world");
        System.out.println(s); //Blank object inside heap
        String s1 = "Learning Core-Java"; //Object created in heap
        System.out.println(s1);
        s1 = s1 + " Concatination"; //s1 is same , here a new object (the variable will points towards different address , previous value will remain same in older address)is created in string constant pool in heap at a separate location
        System.out.println(s1);
        //Previous unchanged s1 is eligible for garbage collection.

        String d1 = "Dev";
        String d2 = "Dev";
        System.out.println(d1 == d2); //Effective Space Utilization via String constant pool.
        //both d1 , d2 use the same address
    }
}