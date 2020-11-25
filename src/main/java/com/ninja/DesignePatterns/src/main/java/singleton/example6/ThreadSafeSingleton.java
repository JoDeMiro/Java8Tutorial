package singleton.example6;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton singleton;

    private String name;
    private Integer age;
    private Double price;

    private ThreadSafeSingleton() {
        this.name = "ThreadSafeSingleton";
        this.age = 1;
        this.price = 3.00;
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new ThreadSafeSingleton();
        }
        return singleton;
    }

    public void method() {
        System.out.println("ThreadSafeSingleton method has been called");
    }

    @Override
    public String toString() {
        return "ThreadSafeSingleton{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
