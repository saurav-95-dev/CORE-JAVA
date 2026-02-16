interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class PushNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending PUSH notification: " + message);
    }
}

class NotificationFactory {

    public static Notification createNotification(String type) {

        if(type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }
        else if(type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        }
        else if(type.equalsIgnoreCase("push")) {
            return new PushNotification();
        }
        else {
            throw new IllegalArgumentException("Invalid notification type");
        }
    }
}

public class SimpleFactoryDemo {

    public static void main(String[] args) {

        Notification notification =
                NotificationFactory.createNotification("email");

        notification.send("Your OTP is 4589");
    }
}

