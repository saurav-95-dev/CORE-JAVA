//FACTORY-DESIGN-PATTERN :
//->Simple Factory : --->it's  design-principal
package com.dev.learning;

//Declare the interface of the product:
interface Burger{
    void prepare();
}

//making concrete class/concrete products to define prepare method:
class NormalBurger implements Burger{
    public void prepare(){
        System.out.println("Preparing normal burger");
    }
}

class StandardBurger  implements Burger{
    public void prepare(){
        System.out.println("Preparing standard burger");
    }
}

class PremiumBurger implements Burger{
    public void prepare(){
        System.out.println("Premium burger");
    }
}





class BurgerFactoryDemo{
    public static void main(String[] args) {
        System.out.println("Simple-Factory");

    }
}