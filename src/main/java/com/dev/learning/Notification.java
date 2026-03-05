interface Payment {
    void pay(int amount);
}
class CreditCard implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPI implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}