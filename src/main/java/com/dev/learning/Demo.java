
package com.dev.learning;

class Mobile{

    Mobile(){
        System.out.println("constructor of mobile");
    }

}
public class Demo{
    static{
        System.out.println("Static block of main method running..."); //this is running because JVM loads the Demo class because it has main()
    }
    Demo(){
        System.out.println("constructor of Demo"); //This will not run as no object is created.
    }

    public static void main(String[] args){


    }
}