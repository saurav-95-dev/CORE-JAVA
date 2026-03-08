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
class PaymentFactory {

    public static PaymentStrategy createPayment(String type) {

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

class PaymentContext {

    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}