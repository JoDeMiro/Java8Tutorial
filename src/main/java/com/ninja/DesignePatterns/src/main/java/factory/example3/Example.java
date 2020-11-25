package factory.example3;

public class Example {
    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();

        Notification notification = notificationFactory.createNotification("SMS");

        notification.notifyUser();

        notification = notificationFactory.createNotification("Emil");

        notification.notifyUser();

        notification = notificationFactory.createNotification("Push");

        notification.notifyUser();

    }
}
