package factory.example4;

public class Example {
    public static void main(String[] args) {

        DogFactory dogFactory = new DogFactory();

        Dog cocker = dogFactory.create(DogType.COCKER);
        cocker.bark();

        Dog german = dogFactory.create(DogType.GERMAN);
        german.bark();

        Dog westie = dogFactory.create(DogType.WESTIE);
        westie.bark();

    }
}
