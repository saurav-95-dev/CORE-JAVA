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
class VehicleFactory {

    public static Vehicle createVehicle(String type) {

        if(type.equalsIgnoreCase("car")) {
            return new Car();
        }
        else if(type.equalsIgnoreCase("bike")) {
            return new Bike();
        }
        else if(type.equalsIgnoreCase("truck")) {
            return new Truck();
        }
        else {
            throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}