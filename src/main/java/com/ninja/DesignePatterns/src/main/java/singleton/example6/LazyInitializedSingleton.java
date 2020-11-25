package singleton.example6;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton singleton;

    private String name;
    private Integer age;
    private Double price;

    private LazyInitializedSingleton() {
        this.name = "LazyInitializedSingleton";
        this.age = 2;
        this.price = 3.00;
    }

    public static LazyInitializedSingleton getInstance() {
        if (singleton == null) {
            singleton = new LazyInitializedSingleton();
        }
        return singleton;
    }

    public void method() {
        System.out.println("LazyInitializedSingleton method has been called");
    }

    @Override
    public String toString() {
        return "LazyInitializedSingleton{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
