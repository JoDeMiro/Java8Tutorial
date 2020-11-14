package com.ninja.stream02;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = getPersons();

        // Filter
        // Imperative approach
        // Select Females
        List<Person> females = new ArrayList<>();

        for (Person person : personList) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }

        females.forEach(System.out::println);

        // Filter
        // Declarative approach
        // Select Females
        List<Person> females_ =
                personList
                        .stream()
                        .filter(person -> person.getGender().equals(Gender.FEMALE))
                        .collect(Collectors.toList());

        females_.forEach(System.out::println);

        // Sort
        // Declarative approach
        //
        List<Person> sorted =
                personList
                        .stream()
                        .sorted(Comparator.comparing(x -> x.getAge()))
                        .collect(Collectors.toList());

        sorted.forEach(System.out::println);

        // Sort reversed
        // Declarative approach
        //
        List<Person> reversed =
                personList
                        .stream()
                        .sorted(Comparator.comparing(Person::getAge).reversed())
                        .collect(Collectors.toList());

        reversed.forEach(System.out::println);

        // Sort reversed then comparing
        // Declarative approach
        //
        List<Person> compared =
                personList
                        .stream()
                        .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed())
                        .collect(Collectors.toList());

        compared.forEach(System.out::println);

        // All match
        // Declarative approach
        //
        boolean allMatch = personList.stream().allMatch(x -> x.getAge() > 5);
        System.out.println(allMatch);

        boolean allMatch_ = personList.stream().allMatch(x -> x.getAge() > 15);
        System.out.println(allMatch_);

        // Any match
        // Declarative approach
        //
        boolean anyMatch = personList.stream().anyMatch(x -> x.getAge() > 8);
        System.out.println(anyMatch);

        boolean anyMatch_ = personList.stream().anyMatch(x -> x.getAge() > 100);
        System.out.println(anyMatch_);

        // None match
        // Declarative approach
        //
        boolean noneMatch = personList.stream().noneMatch(x -> x.getName().equals("Joe"));
        System.out.println(noneMatch);

        boolean noneMatch_ = personList.stream().noneMatch(x -> x.getName().equals("Joe De Miro"));
        System.out.println(noneMatch_);

        // Max
        // Declarative approach
        //
        Optional<Person> max = personList.stream().max(Comparator.comparing(x -> x.getAge()));
        System.out.println(max);

        // Min
        // Declarative approach
        //
        Optional<Person> min = personList.stream().min(Comparator.comparing(x -> x.getAge()));
        System.out.println(min);

        // Group
        // Declarative approach
        //
        Map<Gender, List<Person>> groupByGender = personList.stream().collect(Collectors.groupingBy(x -> x.getGender()));

        groupByGender.forEach(((gender, people) -> {
            System.out.println(gender);
            people.forEach(System.out::println);
        }));

        // Name of Max age in group of Female
        // Declarative approach
        //
        Optional<String> oldestFemaleName =
                personList
                        .stream()
                        .filter(x -> x.getGender().equals(Gender.FEMALE))
                        .max(Comparator.comparing(x -> x.getAge()))
                        .map(x -> x.getName());

        System.out.println(oldestFemaleName);
        System.out.println(oldestFemaleName.get());
        oldestFemaleName.ifPresent(System.out::println);

    }

    private static List<Person> getPersons() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Joe De Miro", 20, Gender.MALE));
        list.add(new Person("Alina Smith", 33, Gender.FEMALE));
        list.add(new Person("Helen White", 57, Gender.FEMALE));
        list.add(new Person("Elena White", 14, Gender.MALE));
        list.add(new Person("Helen Smith", 99, Gender.MALE));
        list.add(new Person("Judit Smith", 7, Gender.FEMALE));
        list.add(new Person("Zelda Brown", 50, Gender.FEMALE));
        return list;
    }
}
