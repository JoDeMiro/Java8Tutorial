package com.ninja.lambda03.unit2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfaceExample {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Mazsi", "Cocker", 12));
        dogs.add(new Dog("Loren", "Cocker", 12));
        dogs.add(new Dog("Coyot", "German", 2));

        // Step 1: Sort list by last name
        Collections.sort(dogs, (o1, o2) -> o1.getName().compareTo(o2.getName()));


        // Step 2: Create a method that prints all elements in the list
        printConditionally(dogs, predicate -> true);



        // Step 3: Create a method that prints all people that have last name beginning with B
        printConditionally(dogs, dog -> dog.getName().startsWith("M"));



        // Step 4: Create a method which consumes an action
        performConditionally(dogs, dog -> dog.getName().startsWith("L"), dog -> System.out.println(dog));

        Consumer<Dog> consumer = new Consumer<Dog>() {
            @Override
            public void accept(Dog dog) {
                System.out.println(dog);
            }
        };

        performConditionally(dogs, dog -> dog.getName().startsWith("C"), consumer);


    }

    public static void printConditionally(List<Dog> dogs, Predicate<Dog> predicate) {
        for (Dog dog : dogs) {
            if (predicate.test(dog)) {
                System.out.println(dog);
            }
        }
    }

    public static void performConditionally(List<Dog> dogs, Predicate<Dog> predicate, Consumer<Dog> consumer) {
        for (Dog dog : dogs) {
            if (predicate.test(dog)) {
                consumer.accept(dog);
            }
        }
    }
}
