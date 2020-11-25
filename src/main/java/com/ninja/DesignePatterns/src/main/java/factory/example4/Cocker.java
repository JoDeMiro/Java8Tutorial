package factory.example4;

public class Cocker extends Dog {

    public Cocker() {
        super(DogType.COCKER);
        create();
    }

    @Override
    protected void create() {
        System.out.println("Cocker spanci has been made");
    }

    @Override
    protected void bark() {
        System.out.println("Hello Cocker Spaniel");
    }
}
