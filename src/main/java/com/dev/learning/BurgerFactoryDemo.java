//FACTORY-DESIGN-PATTERN :
//->Factory Design Pattern ->Injecting abstraction in factory-method
//NOTE:Static method cannot override interface method.
package com.dev.learning;

//First create the interface of the product:
interface Burger{
    void prepare();
}

//Singh-type burger:
class NormalBurger implements Burger{
    public void prepare(){
        System.out.println("This is normal burger");
    }
}

class StandardBurger implements Burger{
    public void prepare(){
        System.out.println("This is standard burger");
    }
}

class PremiumBurger implements Burger{
    public void prepare(){
        System.out.println("This is premium burger");
    }
}
//Kings-type burger:
class NormalWheatBurger implements Burger{
    public void prepare(){
        System.out.println("This is normal wheat burger");
    }
}
class StandardWheatBurger implements Burger{
    public void prepare(){
        System.out.println("This is standard wheat burger");
    }
}

class  PremiumWheatBurger implements Burger{
    public void prepare(){
        System.out.println("This is premium wheat burger");
    }
}

interface BurgerFactory{
    Burger createBurger(String choice);
}

class SinghBurger implements BurgerFactory{
    public Burger createBurger(String choice){
        if(choice.equalsIgnoreCase("normal")){
            return new NormalBurger();
        }
        else if(choice.equalsIgnoreCase("premium")){
            return new PremiumBurger();
        }
        else if(choice.equalsIgnoreCase("standard")){
            return new StandardBurger();
        }
        else{
            return null;
        }

    }
}

class KingBurger implements BurgerFactory{
    public Burger createBurger(String choice){
        if(choice.equalsIgnoreCase("normal")){
            return  new NormalWheatBurger();
        }
        else if(choice.equalsIgnoreCase("premium")){
            return new PremiumWheatBurger();
        }
        else if(choice.equalsIgnoreCase("standard")){
            return new StandardWheatBurger();
        }
        else{
            return null;
        }
    }
}

//Client-side code :
public class BurgerFactoryDemo {
    public static void main(String[] args) {
        String userChoice = "standard";
        BurgerFactory factory = new KingBurger();
        Burger burger = factory.createBurger(userChoice);
        burger.prepare();

    }
}




