//Simple-Factory:
package com.dev.learning;

//Product Interface :
interface Burger{
    public void prepareBurger();
}

//Concrete classes that will implement Burger Interface:
class NormalBurger implements Burger{
    public void prepareBurger(){
        System.out.println("Normal Burger");
    }
}
class StandardBurger implements Burger{
    public void prepareBurger(){
        System.out.println("Standard Burger");
    }
}
class PremiumBurger implements Burger{
    public void prepareBurger(){
        System.out.println("Premium Burger");
    }
}

//Factory-class and method that will return burger :
class BurgerFactory{

    public static Burger createBurgerFactory(String userChoice){
        if(userChoice.equalsIgnoreCase("normal")){
            return new NormalBurger();
        }
        else if(userChoice.equalsIgnoreCase("premium")){
            return new PremiumBurger();
        }
        else if(userChoice.equalsIgnoreCase("standard")){
            return new StandardBurger();
        }
        return null;
    }
}

//Client-Code:
class SimpleFactory{
    public static void main(String[] args){
          Burger burgerType = BurgerFactory.createBurgerFactory("standard");
          burgerType.prepareBurger();
    }
}