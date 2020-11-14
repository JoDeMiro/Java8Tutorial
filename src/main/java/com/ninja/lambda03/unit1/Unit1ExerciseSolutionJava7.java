package com.ninja.lambda03.unit1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Doe", 30));
        people.add(new Person("Jack", "Doe", 35));
        people.add(new Person("Jack", "Dye", 40));
        people.add(new Person("Jeff", "Bry", 45));
        people.add(new Person("Jeff", "Dry", 50));

        // Step 1: Sort list by last  name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });



        // Step 2: Create a method that prints all elements in the list
        printAllPerson(people);



        // Step 3: Create a method that prints all people that have last name beginning with B
        printAllPersonWithB(people);



        // Step 3:
        printAllPersonWithCondition(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("B");
            }
        });


    }

    private static void printAllPersonWithCondition(List<Person> people, Condition condition) {
        for (Person person : people) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }

    private static void printAllPersonWithB(List<Person> people) {
        for (Person person : people) {
            if (person.getLastName().startsWith("B")) {
                System.out.println(person);
            }
        }
    }

    private static void printAllPerson(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

interface Condition {
    boolean test(Person person);
}
