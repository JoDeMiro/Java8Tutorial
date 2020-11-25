package factory.example4;

public class DogFactory {
    public Dog create(DogType dogType) {
        Dog dog = null;

        switch (dogType) {
            case COCKER:
                dog = new Cocker();
                break;

            case GERMAN:
                dog = new German();
                break;

            case WESTIE:
                dog = new Westie();
                break;

            default:
                // throw some exception
                break;
        }
        return dog;
    }
}
