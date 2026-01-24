//All about static variable ---> CONTENTS:
//->static keyword/variable , static block.
//->static/non-static methods, instance VS static variable, static variable behaviour inside constructor.
//->static members execution flow and class loader.
//->Variable cerated inside class will be called as instance variable.
//->Variable created inside method will be referred as local variable.
//->Static variables are shared by all the objects & they belong to a class not object and hence can be accessed via className
package com.dev.learning;

class Mobile{
    //instance variable
    int price;
    String company;
    static String device;

    public void show(){
        System.out.println("Price: ,"+ price + " Company: ,"+ company + " Device-Type: "+ device);
    }

}
public class Demo{
    public static void main(String[] args) {
          Mobile mobile1 = new Mobile();
          mobile1.price = 100;
          mobile1.company = "Samsung";
          Mobile.device = "ipad";

          Mobile mobile2 = new Mobile();
          mobile2.price = 200;
          mobile2.company = "Motorola";
          Mobile.device = "ipad";
          mobile1.show();
          System.out.println();
          mobile2.show();


    }
}