//CONCEPT OF IMMUTABLE STRINGS IN JAVA;
package com.dev.learning;

class Laptop{
    int price;
    String brand;
    static String device;
    static{
        device = "Lappy";
        System.out.println("inside static block");
    }
    ///constructor:
    public Laptop(){
        price = 0;
        brand = "not defined";
        System.out.println("inside constructor");
    }
    public void show(){
        System.out.println("price:" + price + " brand:" + brand + " device:" + device);
    }
}
class Main{
    public static void main(String[] args){
        System.out.println("Main function");
        System.out.println();
        Laptop laptop1 = new Laptop();
        laptop1.price = 100;
        laptop1.brand = "HP";
        Laptop laptop2 = new Laptop();
        laptop2.price = 200;
        laptop2.brand = "Apple";
        laptop1.show();

    }
}