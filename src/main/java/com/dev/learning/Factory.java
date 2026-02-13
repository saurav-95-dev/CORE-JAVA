//Factory-Design-Pattern:

package com.dev.learning;

//product-interface:
interface Burger{
    public void createBurger();
}

//Concrete classes for 2-types of products:
//Singh-Type-Burger:
class NormalBurger implements Burger{
    public void createBurger() {
        System.out.println("Normal Burger created");
    }
}
class StandardBurger implements Burger{
    public void createBurger() {
        System.out.println("Standard Burger created");
    }
}
class PremiumBurger implements Burger{
    public void createBurger() {
        System.out.println("Premium Burger created");
    }
}
//King-Type-Burger:
class NormalWheatBurger implements Burger{
    public void createBurger() {
        System.out.println("Normal Wheat Burger created");
    }
}
class StandardWheatBurger implements Burger{
    public void createBurger() {
        System.out.println("Standard Wheat Burger created");
    }
}
class PremiumWheatBurger implements Burger{
    public void createBurger() {
        System.out.println("Premium Wheat Burger created");
    }
}
//Making Factory abstract for 2 different products:
interface BurgerFactory{
     public void singhBurger();
     public void kingBurger();
}

c