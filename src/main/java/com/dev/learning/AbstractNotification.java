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

class PaymentFactory {

    public static Payment createPayment(String type) {

        if(type.equalsIgnoreCase("credit")) {
            return new CreditCardPayment();
        }
        else if(type.equalsIgnoreCase("upi")) {
            return new UPIPayment();
        }
        else if(type.equalsIgnoreCase("paypal")) {
            return new PayPalPayment();
        }
        else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }
}
public class SimpleFactoryDemo {

    public static void main(String[] args) {

        Payment payment =
                PaymentFactory.createPayment("upi");

        payment.processPayment(5000);
    }
}

