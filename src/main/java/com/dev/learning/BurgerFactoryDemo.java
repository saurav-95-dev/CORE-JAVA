package com.dev.learning;//Building-Abstract-Products

// Burger
interface Burger {
    void prepare();
}

// Drink
interface Drink {
    void pour();
}

// ---------- Concrete Burger Products ----------

class NormalBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Normal Burger");
    }
}

class StandardBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Standard Burger ");
    }
}

class PremiumBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Premium Burger ");
    }

}

// ---------- Concrete Drink Products ----------

class Coke implements Drink {
    public void pour() {
        System.out.println("Pouring Cocacola");
    }
}

class Lemonade implements Drink {
    public void pour() {
        System.out.println("Pouring Lemonade ");
    }
}

class ColdCoffee implements Drink {
    public void pour() {
        System.out.println("Pouring Cold Coffee ☕🥤");
    }
}