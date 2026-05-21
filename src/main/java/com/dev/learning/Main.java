package com.dev.learning;

class Computer{
    int price;
    String company;
    static String  deviceType; //member of class
    //constructor:
    public Computer(){
        price = 0;
        company = "Ultikhopdi";
        System.out.println("inside constructor");
    }
    static{
        deviceType = "not decided";
        System.out.println("inside static block");
    }
    public static void show(Computer obj1){
        System.out.println("Price:" + obj1.price + " company:" + obj1.company + " deviceType:" + deviceType);
    }

}

class Main{
    public static void main(String[] args){
         //Concept of static keyword :
         Computer obj1 = new Computer();
         obj1.price = 100;
         obj1.company = "HP";
         obj1.deviceType = "Laptop";
         Computer obj2 = new Computer();
         obj2.price = 200;
         obj2.company = "Apple";
         Computer.deviceType = "Lappy";
         obj1.show(obj1);

    }
}