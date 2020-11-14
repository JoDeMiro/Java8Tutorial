package com.ninja.stream04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CollectionIterationExample {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Mazsi", "Cocker", 12));
        dogs.add(new Dog("Loren", "Cocker", 12));
        dogs.add(new Dog("Coyot", "German", 2));

        // External Iterators

        // Java 7
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i));
        }

        // Java 7
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        // Java 7
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).getAge());
        }

        // Java 7
        for (Dog dog : dogs) {
            System.out.println(dog.getAge());
        }

        // Internal Iterators

        // Java 8
        dogs.forEach(new Consumer<Dog>() {
            @Override
            public void accept(Dog dog) {
                System.out.println(dog);
            }
        });

        // Java 8
        dogs.forEach(new Consumer<Dog>() {
            @Override
            public void accept(Dog dog) {
                System.out.println(dog.getAge());
            }
        });

        // Java 8
        dogs.forEach(dog -> System.out.println(dog));

        // Java 8
        dogs.forEach(dog -> System.out.println(dog.getAge()));

        // Java 8
        dogs.forEach(System.out::println);

        // Java 8
        Consumer<Dog> consumer = new Consumer<Dog>() {
            @Override
            public void accept(Dog dog) {
                System.out.println(dog.getName() + " " + dog.getAge());
            }
        };

        dogs.forEach(consumer);

    }
}
