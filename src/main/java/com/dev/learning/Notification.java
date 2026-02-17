interface Vehicle {
    void manufacture();
}

class Car implements Vehicle {
    public void manufacture() {
        System.out.println("Manufacturing a Car");
    }
}

class Bike implements Vehicle {
    public void manufacture() {
        System.out.println("Manufacturing a Bike");
    }
}

class Truck implements Vehicle {
    public void manufacture() {
        System.out.println("Manufacturing a Truck");
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

