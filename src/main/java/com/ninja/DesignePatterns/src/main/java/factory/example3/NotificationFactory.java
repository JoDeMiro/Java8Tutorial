package factory.example3;

public class NotificationFactory {
    public Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        if ("SMS".equals(type)) {
            return new SMSNotification();
        }
        if ("Emil".equals(type)) {
            return new EmailNotification();
        }
        if ("Push".equals(type)) {
            return new PushNotification();
        }
        return null;
    }
}
