package com.ninja.stream04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasic02 {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Mazsi", "Cocker", 12));
        dogs.add(new Dog("Loren", "Cocker", 12));
        dogs.add(new Dog("Coyot", "German", 2));


        dogs.forEach(dog -> System.out.println(dog));

        dogs.stream().forEach(dog -> System.out.println(dog));

        // Stream is Generic Class
        Stream<Dog> stream = dogs.stream();

        stream.forEach(dog -> System.out.println(dog));

        //
        dogs.stream()
                .filter(dog -> dog.getAge() > 10)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //
        List<Dog> collect = dogs
                .stream()
                .filter(dog -> dog.getName().startsWith("C"))
                .collect(Collectors.toList());

        collect.forEach(dog -> System.out.println(dog.getName() + " " + dog.getAge()));
    }
}