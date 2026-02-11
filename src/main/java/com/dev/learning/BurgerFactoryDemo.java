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

//Creating factory class:
class BurgerFactory{
    public static Burger createBurger(String burgerType){
          if(burgerType.equalsIgnoreCase("normal")){
            return new NormalBurger(); //send a ready-made object from factory class
          }
          else if(burgerType.equalsIgnoreCase("standard")){
              return new StandardBurger();
          }
          else if(burgerType.equalsIgnoreCase("premium")){
              return new PremiumBurger();
          }
          else {
              return null;
          }
    }
}

//client-code---main-function:
class BurgerFactoryDemo{
    public static void main(String[] args) {
        System.out.println("Simple-Factory");
        String userChoice = "normal";
        //creating reference of interface. but for object creation,
        Burger burger = BurgerFactory.createBurger(userChoice);
        burger.prepare();

    }
}