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
//kings-type-product:
class NormalWheatBurger implements Burger{
    public void createBurger(){
        System.out.println("This is a normal wheat burger");
    }
}
class StandardWheatBurger implements Burger{
    public void createBurger(){
        System.out.println("This is a standard wheat burger");
    }
}
class PremiumWheatBurger implements Burger{
    public void createBurger(){
        System.out.println("This is a premium wheat burger");
    }
}
class NormalWheatGarlicBread implements GarlicBread{
    public void createGarlicBread(){
        System.out.println("This is a normal wheat garlic bread");
    }
}
class CheeseWheatGarlicBread implements GarlicBread{
    public void createGarlicBread(){
        System.out.println("This is a cheese wheat garlic bread");
    }
}

//making BurgerFactory
interface BurgerFactory{
    Burger createBurger(String userChoice);
    GarlicBread createGarlicBread(String userChoice);
}

class SinghBurgerFactory implements BurgerFactory{
    public Burger createBurger(String userChoice){
        if(userChoice.equalsIgnoreCase("normal")){
            return new NormalBurger();
        }
        else if(userChoice.equalsIgnoreCase("standard")){
            return new PremiumBurger();
        }
        else if(userChoice.equalsIgnoreCase("premium")){
            return new PremiumBurger();
        }
        else
            return null;
    }
    public GarlicBread createGarlicBread(String userChoice){
        if(userChoice.equalsIgnoreCase("normal")){
            return new NormalGarlicBread();
        }
        else if(userChoice.equalsIgnoreCase("cheese")){
            return new CheeseGarlicBread();
        }
        else{
            return null;
        }
    }
}



class BurgerFactoryDemo{
    public static void main(String[] args){
        System.out.println("Abstract Factory");

    }
}