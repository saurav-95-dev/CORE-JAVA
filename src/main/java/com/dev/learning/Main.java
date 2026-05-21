package com.dev.learning;

//String concept revision :
class Main{
    public static void main(String[] args){
        //How String Immutability helps in string pool optimization:
        String s1 = "Saurabh";
        String s2 = "saurabh";
        String s3 = "Saurabh";
        System.out.println(s1.equals(s3));
        //in above case only one object is created and both s1 and s3 points to teh same object in the heap memory.
        s3 = s3 + " Dev"; //here we have created a separate new object in heap and s3 is now pointing to that new location.

        System.out.println(s1==s3);
        System.out.println(s3);
    }
}