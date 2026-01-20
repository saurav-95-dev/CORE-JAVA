//REV-String :
//Note : Strings --> Immutable in java by default

package com.dev.learning;

public class Demo{
    public static void main(String[] args){
        System.out.println("Inside main method:");
        String s = new String("Hello world");
        System.out.println(s); //Blank object inside heap
        String s1 = "Learning Core-Java";
        System.out.println(s1);


    }
}