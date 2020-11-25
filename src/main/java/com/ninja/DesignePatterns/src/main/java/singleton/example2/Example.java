package singleton.example2;

public class Example {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.method();
        singleton2.method();

        if (singleton1 == singleton2) {
            System.out.println("They are Same");
        }
    }
}
