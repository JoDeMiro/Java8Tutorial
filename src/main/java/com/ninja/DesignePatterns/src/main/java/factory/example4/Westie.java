package factory.example4;

public class Westie extends Dog {
    public Westie() {
        super(DogType.WESTIE);
        create();
    }

    @Override
    protected void create() {
        System.out.println("Westie has been made");
    }

    @Override
    protected void bark() {
        System.out.println("Hello Westie");
    }
}
