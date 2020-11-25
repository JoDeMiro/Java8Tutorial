package factory.example4;

public abstract class Dog {

    private DogType type = null;

    public Dog(DogType dogType) {
        this.type = dogType;
        setup();
    }

    private void setup() {
        // Do one time processing here
    }

    // Do subclass level processing in this method
    protected abstract void create();

    // Do subclass level processing in this method
    protected abstract void bark();

    // Get
    public DogType getType() {
        return type;
    }

    // Set
    public void setType(DogType type) {
        this.type = type;
    }
}
