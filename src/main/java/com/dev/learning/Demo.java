//All about static variable ---> CONTENTS:
//->static keyword/variable , static block.
//->static/non-static methods, instance VS static variable, static variable behaviour inside constructor.
//->static members execution flow and class loader.
//->Variable cerated inside class will be called as instance variable.
//->Variable created inside method will be referred as local variable.
//->Static variables are shared by all the objects & they belong to a class not object and hence can be accessed via className.
//CONCEPT - We can initialise a static variable inside a constructor .
/*Problem with above - Everytime an object gets created, constructor will get called initialising the instance variable
which is fine.But it will also initialise the static variable which is not the part of the object .
Hence , static variable should be initialised inside static block(runs only once)
 */
/*Whenever object is create -->1)Class loads first(static block get called) , 2)Object gets initialised
So that means that if we don't have any object, both constructor and static block will not get called.
 */
package com.dev.learning;

class Mobile{
    //instance variable
    int price;
    String company;
    static String device;

    //constructor:
    public Mobile(int price, String company) {
        this.price = price;
        this.company = company;
        System.out.println("Constructor runs..");
    }

    static{
        device = "Android";
        System.out.println("Static block runs..");
    }

    public void show(){
        System.out.println("Price:"+ price + "  Company:"+ company + "  Device-Type:"+ device);
    }

}
public class Demo{
    public static void main(String[] args) {
          Mobile mobile1 = new Mobile(12 , "Sapient");
//          mobile1.price = 100;
//          mobile1.company = "Samsung";
//          Mobile.device = "ipad";
          mobile1.show();
          Mobile mobile2 = new Mobile(13 , "Deloitte");
//          mobile2.price = 200;
//          mobile2.company = "Motorola";
//          Mobile.device = "ipad";
          mobile2.show();


    }
}