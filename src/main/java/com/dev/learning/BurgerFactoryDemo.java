//ABSTRACT-FACTORY-DESIGN-PATTERN :
package com.dev.learning;

//2-Product-Interface
interface Burger{
    void createBurger();
}
interface GarlicBread{
    void createGarlicBread();
}

//singh-type-product
class NormalBurger implements Burger{
    public void createBurger(){
        System.out.println("This is a normal burger");
    }
}
class SandardBurger implements Burger{
    public void createBurger(){
        System.out.println("This is a standard burger");
    }
}
class PremiumBurger implements Burger{
    public void createBurger(){
        System.out.println("This is a premium burger");
    }
}
class NormalGarlicBread implements GarlicBread{
    public void createGarlicBread(){
        System.out.println("This is a normal garlic bread");
    }
}
class CheeseGarlicBread implements GarlicBread{
    public void createGarlicBread(){
        System.out.println("This is a cheese garlic bread");
    }
}




class BurgerFactoryDemo{
    public static void main(String[] args){
        System.out.println("Abstract Factory");

    }
}