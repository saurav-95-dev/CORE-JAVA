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
