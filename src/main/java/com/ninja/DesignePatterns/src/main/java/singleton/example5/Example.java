package singleton.example5;

public class Example {
    public static void main(String[] args) {

        Singleton x = Singleton.getInstance();

        Singleton y = Singleton.getInstance();

        Singleton z = Singleton.getInstance();

        System.out.println(x.getName());
        System.out.println(y.getName());
        System.out.println(z.getName());

        x.setName("The name has been changed");

        System.out.println(x.getName());
        System.out.println(y.getName());
        System.out.println(z.getName());

        System.out.println(x);
    }
}
