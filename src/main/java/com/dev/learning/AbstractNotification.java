interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println("Processing ₹" + amount + " using Credit Card");
    }
}

class UPIPayment implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println("Processing ₹" + amount + " using UPI");
    }
}

class PayPalPayment implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println("Processing ₹" + amount + " using PayPal");
    }
}