package com.dev.learning;

class Mobile{
    String company;
    int price;
    static String device;

    static{
        device = "General";
        System.out.println("inside static block");
    }
    //constructor:
    public Mobile(){
        company = "default";
        price = 0;
        System.out.println("inside constructor");
    }
    static void show(Mobile obj2){
        System.out.println("inside show");
        System.out.println("Company:"+obj2.company + ", Price:"+obj2.price + ", Device:"+device);
    }

}
class Main{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.company = "Apple";
        obj1.price = 100;
        Mobile obj2 = new Mobile();
        obj2.company = "Nokia";
        obj2.price = 100000;
        Mobile.show(obj2);
        //obj2.show();



    }
}