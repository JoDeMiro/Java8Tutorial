package singleton.example1;

public final class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void method() {
        System.out.println("Hello Singleton");
    }
}
