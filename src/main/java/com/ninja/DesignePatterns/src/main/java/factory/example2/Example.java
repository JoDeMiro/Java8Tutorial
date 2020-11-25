package factory.example2;

// Now that I’ve created my dog factory, the Dog interface, and all of the dog sub-types, I’ll create a “driver” program
// named Example to test the Dog factory.
// This driver class demonstrates how to get different types of dogs from the factory:

/**
 * A "driver" program to demonstrate my "dog factory".
 * @author ninja ninja, ninja.com
 */

public class Example {
    public static void main(String[] args) {
        // create a DogFactory
        DogFactory dogFactory = new DogFactory();

        // create a small dog
        Dog dog = dogFactory.getDog("small");
        assert dog != null;
        dog.speak();

        // create a big dog
        dog = dogFactory.getDog("big");
        assert dog != null;
        dog.speak();

        // create a working dog
        dog = dogFactory.getDog("working");
        assert dog != null;
        dog.speak();
    }
}
