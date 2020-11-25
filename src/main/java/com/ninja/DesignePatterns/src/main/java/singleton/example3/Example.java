package singleton.example3;

public class Example {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        singleton.demoProtectedMethod();

        singleton.demoPublicMethod();

    }
}
