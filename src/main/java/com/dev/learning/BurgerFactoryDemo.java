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