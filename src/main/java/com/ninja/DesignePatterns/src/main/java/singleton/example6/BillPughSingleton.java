package singleton.example6;

public class BillPughSingleton {

    private String name;
    private Integer age;
    private Double price;

    private BillPughSingleton() {
        this.name = "BillPughSingleton";
        this.age = 3;
        this.price = 3.00;
    }

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void method() {
        System.out.println("BillPughSingleton method has been called");
    }

    @Override
    public String toString() {
        return "BillPughSingleton{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
