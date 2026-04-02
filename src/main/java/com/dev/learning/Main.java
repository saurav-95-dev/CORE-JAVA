package com.dev.learning;

class Main{
    public static void main(String[] args) {
        String s1 = "Saurabh";
        String s2 = "Saurabh"; //string pool optimization
        System.out.println(s1 == s2);
        s2 = s2 + "dev"; //a new object is created here.
        System.out.println(s1 == s2);
        //we can have multiple references pointing at same object in heap , because of immutability property of string.

    }
}