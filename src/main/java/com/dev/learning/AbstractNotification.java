interface Vehicle {
    void start();
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
}

class Truck implements Vehicle {
    public void start() {
        System.out.println("Truck is starting...");
    }
}