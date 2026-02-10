package com.dev.learning;

// 1. Product Interface
interface Burger {
    void prepare();
}

// 2. Concrete Products
class NormalBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Normal Burger 🍔");
    }
}
class StandardBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Standard Burger 🍔🍟");
    }
}

class PremiumBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Premium Burger 🍔🥓🧀");
    }
}

// 3. Factory Class
class BurgerFactory {

    public static Burger getBurger(String type) {

        if (type.equalsIgnoreCase("NORMAL"))
            return new NormalBurger();

        else if (type.equalsIgnoreCase("STANDARD"))
            return new StandardBurger();

        else if (type.equalsIgnoreCase("PREMIUM"))
            return new PremiumBurger();

        throw new IllegalArgumentException("Invalid Burger Type");
    }
}