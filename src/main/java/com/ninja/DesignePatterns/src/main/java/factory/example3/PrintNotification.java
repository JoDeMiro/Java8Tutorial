package factory.example3;

public class PrintNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Print Hello");
    }
}
