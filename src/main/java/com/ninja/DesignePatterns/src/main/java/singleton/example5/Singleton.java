package singleton.example5;

public class Singleton {

    private static Singleton singleton = null;

    private String name;        // Changeable via setName()
    private Integer age;
    private Double price;

    private Singleton() {
        this.name = "Original Name";
        this.age = 1;
        this.price = 3.00;
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
