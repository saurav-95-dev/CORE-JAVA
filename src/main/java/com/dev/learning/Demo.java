//Static keyword all concept :
//Keys->
/*
->static members belongs to class not object unlike instance variables.
->In order to call a non-static method , we require object of class .Hence we make main method static.
->static members should be initialised under static block(which runs only once ) not  in constructors
 */
package com.dev.learning;

class Mobile{
    int price;
    String name;
    static String device;

    static{
        device = "universal";
    }
    //constructor:
    public Mobile(int price, String name) {
        this.price = price;
        this.name = name;
    }
    public void show(){
        System.out.println("Price:" + price + "  Name:" + name + "  Device:" + device);
    }
}
class Demo{
    public static void main(String[] args){
        System.out.println("Static - All in one:");
        Mobile mobile1 = new Mobile(12 , "motorola");
        mobile1.price = 122;
        mobile1.name = "iphone";
        mobile1.show();
        System.out.println();
        Mobile mobile2 = new Mobile(11 , "Apple");
        mobile2.show();
        //Changing the default value of static variable defined in static block.
        System.out.println();
        Mobile.device = "Universal was changed for both mobiles";
        mobile2.show();
        mobile1.show();
    }
}