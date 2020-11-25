package singleton.example6;

public class StaticBlockSingleton {

    private static StaticBlockSingleton singleton;

    private String name;
    private Integer age;
    private Double price;

    private StaticBlockSingleton() {
        this.name = "StaticBlockSingleton";
        this.age = 1;
        this.price = 3.00;
    }

    // static block initialization for exception handling
    static {
        try {
            singleton = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return singleton;
    }

    public void method() {
        System.out.println("StaticBlockSingleton method has been called");
    }

    @Override
    public String toString() {
        return "StaticBlockSingleton{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
