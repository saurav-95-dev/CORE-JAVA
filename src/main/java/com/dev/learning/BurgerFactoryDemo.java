// File name: BurgerFactoryMethodDemo.java

// 1. Product Interface
interface Burger {
    void prepare();
}

// 2. Concrete Products
class NormalBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Normal Burger");
    }
}

class StandardBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Standard Burger");
    }
}

class PremiumBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Premium Burger ");
    }
}

// 3. Creator (Factory Method)
abstract class BurgerStore {

    // Factory Method
    protected abstract Burger createBurger();

    // Template method (fixed flow)
    public void orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
    }
}

// 4. Concrete Creators
class NormalBurgerStore extends BurgerStore {
    protected Burger createBurger() {
        return new NormalBurger();
    }
}

class StandardBurgerStore extends BurgerStore {
    protected Burger createBurger() {
        return new StandardBurger();
    }
}

class PremiumBurgerStore extends BurgerStore {
    protected Burger createBurger() {
        return new PremiumBurger();
    }
}

// 5. Client
public class BurgerFactoryMethodDemo {

    public static void main(String[] args) {

        BurgerStore store;

        String userChoice = "PREMIUM";

        if (userChoice.equalsIgnoreCase("NORMAL")) {
            store = new NormalBurgerStore();
        } else if (userChoice.equalsIgnoreCase("STANDARD")) {
            store = new StandardBurgerStore();
        } else {
            store = new PremiumBurgerStore();
        }

        store.orderBurger();
    }
}
