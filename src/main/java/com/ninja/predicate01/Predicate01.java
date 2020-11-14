package com.ninja.predicate01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate01 {

    public static void main(String[] args) {

        List<Person> personList = getPersons();

        // Filter
        // Imperative approach
        //
        List<Person> females = new ArrayList<>();

        for (Person person : personList) {
            if (person.gender.equals(Gender.FEMALE)) {
                females.add(person);
            }
        }

        females.forEach(System.out::println);

        // Filter
        // Declarative approach
        //
        List<Person> females_ =
                personList
                        .stream()
                        .filter(x -> x.gender.equals(Gender.FEMALE))
                        .collect(Collectors.toList());

        females_.forEach(System.out::println);

        // Filter
        // Declarative approach
        //
        Predicate<Person> femalePredicate = x -> x.gender.equals(Gender.FEMALE);

        List<Person> females__ =
                personList
                        .stream()
                        .filter(femalePredicate)
                        .collect(Collectors.toList());

        females__.forEach(System.out::println);
    }

    private static List<Person> getPersons() {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Johanna", Gender.FEMALE));
        personList.add(new Person("Mariann", Gender.FEMALE));
        personList.add(new Person("Aishah", Gender.FEMALE));
        personList.add(new Person("George", Gender.MALE));
        personList.add(new Person("Steven", Gender.MALE));

        return personList;
    }

    static class Person {

        private String name;
        private Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}

