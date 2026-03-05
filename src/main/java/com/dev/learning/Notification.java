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
// Factory Class
class PaymentFactory {
    public static Payment getPayment(String type) {
        if (type.equalsIgnoreCase("CREDIT")) {
            return new CreditCard();
        } else if (type.equalsIgnoreCase("UPI")) {
            return new UPI();
        }
        return null;
    }
}

public class FactoryPaymentExample {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPayment("UPI");
        payment.pay(2000);
    }
}