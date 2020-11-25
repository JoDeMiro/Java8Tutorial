package singleton.example3;

public class Singleton {

    private final static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }

    protected void demoProtectedMethod() {
        System.out.println("Protected void demoProtectedMethod");
    }

    public void demoPublicMethod() {
        System.out.println("Public void demoPublicMethod");
    }
}
