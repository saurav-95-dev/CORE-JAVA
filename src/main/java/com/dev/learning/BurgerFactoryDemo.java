//ABSTRACT-FACTORY-DESIGN-PATTERN :
package com.dev.learning;

//2-Product-Interface
interface Burger{
    void createBurger();
}
interface GarlicBread{
    void createGarlicBread();
}




class BurgerFactoryDemo{
    public static void main(String[] args){
        System.out.println("Abstract Factory");

    }
}