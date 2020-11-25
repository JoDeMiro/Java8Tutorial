package factory.example4;

public class German extends Dog {
    public German() {
        super(DogType.GERMAN);
        create();
    }

    @Override
    protected void create() {
        System.out.println("German Sheppard has been made");
    }

    @Override
    protected void bark() {
        System.out.println("Hello German Sheppard");
    }
}
