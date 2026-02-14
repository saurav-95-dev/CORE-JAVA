interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via Credit Card");
    }
}

class UPIPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via UPI");
    }
}

class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via PayPal");
    }
}
