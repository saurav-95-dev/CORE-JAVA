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

/ ---------- Abstract Factory ----------

interface MealFactory {
    Burger createBurger();
    Drink createDrink();
}

// ---------- Concrete Factories ----------

class NormalMealFactory implements MealFactory {
    public Burger createBurger() {
        return new NormalBurger();
    }
    public Drink createDrink() {
        return new Lemonade();
    }
}

class StandardMealFactory implements MealFactory {
    public Burger createBurger() {
        return new StandardBurger();
    }
    public Drink createDrink() {
        return new Coke();
    }
}

class PremiumMealFactory implements MealFactory {
    public Burger createBurger() {
        return new PremiumBurger();
    }
    public Drink createDrink() {
        return new ColdCoffee();
    }
}

// ---------- Client ----------

public class BurgerAbstractFactoryDemo {

    public static void main(String[] args) {

        MealFactory factory;

        String userChoice = "PREMIUM";

        if (userChoice.equalsIgnoreCase("NORMAL")) {
            factory = new NormalMealFactory();
        } else if (userChoice.equalsIgnoreCase("STANDARD")) {
            factory = new StandardMealFactory();
        } else {
            factory = new PremiumMealFactory();
        }

        Burger burger = factory.createBurger();
        Drink drink = factory.createDrink();

        burger.prepare();
        drink.pour();
    }
}

/ ---------- Abstract Factory ----------

interface MealFactory {
    Burger createBurger();
    Drink createDrink();
}

// ---------- Concrete Factories ----------

class NormalMealFactory implements MealFactory {
    public Burger createBurger() {
        return new NormalBurger();
    }
    public Drink createDrink() {
        return new Lemonade();
    }
}

class StandardMealFactory implements MealFactory {
    public Burger createBurger() {
        return new StandardBurger();
    }
    public Drink createDrink() {
        return new Coke();
    }
}

class PremiumMealFactory implements MealFactory {
    public Burger createBurger() {
        return new PremiumBurger();
    }
    public Drink createDrink() {
        return new ColdCoffee();
    }
}

// ---------- Client ----------

public class BurgerAbstractFactoryDemo {

    public static void main(String[] args) {

        MealFactory factory;

        String userChoice = "PREMIUM";

        if (userChoice.equalsIgnoreCase("NORMAL")) {
            factory = new NormalMealFactory();
        } else if (userChoice.equalsIgnoreCase("STANDARD")) {
            factory = new StandardMealFactory();
        } else {
            factory = new PremiumMealFactory();
        }

        Burger burger = factory.createBurger();
        Drink drink = factory.createDrink();

        burger.prepare();
        drink.pour();
    }
}