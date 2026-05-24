//CONCEPT OF IMMUTABLE STRINGS IN JAVA;
package com.dev.learning;

class Main{
    public static void main(String[] args){
        System.out.println("inside main function");
        String s1 = "Saurabh";
        String s2 = "Dev";
        String s3 = "Saurabh";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //here s3 will share same memory address as that of s1 in SPC
        //Immutability of string in java help us to have multiple references in stack pointing to the same object in heap.
        s1 = s1+" change"; //s1 will start pointing to a new object in the heap
        System.out.println();
        System.out.println("After modification:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}