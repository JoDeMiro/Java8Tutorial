package com.ninja.lambda02;

import java.util.Comparator;

public class LambdaExample01 {

    public static void main(String[] args) {

        // Normal implementation
        Comparator<String> stringComparator1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        int comparison = stringComparator1.compare("Hello", "Word");
        System.out.println(comparison);

        // Lambda implementation
        Comparator<String> stringComparator2 = (String o1, String o2) -> { return o1.compareTo(o2); };

        int lambdaComparison1 = stringComparator2.compare("Hello", "Word");
        System.out.println(lambdaComparison1);

        // Very short lambda implementation
        Comparator<String> stringComparator3 = (o1, o2) -> o1.compareTo(o2);

        int lambdaComparison2 = stringComparator3.compare("Hello", "World");
        System.out.println(lambdaComparison2);


        // MyFunctionA
        MyFunctionA myFunctionA1 = new MyFunctionA() {
            @Override
            public void apply() {
                System.out.println("Hello MyFunctionA1");
            }
        };

        // MyFunctionA
        MyFunctionA myFunctionA2 = () -> {
            System.out.println("Hello MyFunctionA2");
        };

        // MyFunctionA
        MyFunctionA myFunctionA3 = () -> System.out.println("Hello MyFunctionA3");

        myFunctionA1.apply();
        myFunctionA2.apply();
        myFunctionA3.apply();


        // MyFunctionB
        MyFunctionB myFunctionB1 = new MyFunctionB() {
            @Override
            public void apply(String string) {
                System.out.println("Hello " + string);
            }
        };

        // MyFunctionB
        MyFunctionB myFunctionB2 = (x) -> {
            System.out.println("Hello " + x);
        };

        // MyFunctionB
        MyFunctionB myFunctionB3 = (x) -> System.out.println("Hello " + x);

        // MyFunctionB
        MyFunctionB myFunctionB4 = x -> System.out.println("Hello " + x);

        myFunctionB1.apply("MyFunctionB1");
        myFunctionB2.apply("MyFunctionB2");
        myFunctionB3.apply("MyFunctionB3");
        myFunctionB4.apply("MyFunctionB4");


        // MyFunctionC
        MyFunctionC myFunctionC1 = new MyFunctionC() {
            @Override
            public void apply(String a, String b) {
                System.out.println("Hello " + a + " " + b);
            }
        };

        // MyFunctionC
        MyFunctionC myFunctionC2 = (firstname, lastname) -> {
            System.out.println("Hello " + firstname + " " + lastname);
        };

        // MyFunctionC
        MyFunctionC myFunctionC3 = (firstname, lastname) -> System.out.println("Hello " + firstname + " " + lastname);

        myFunctionC1.apply("Kiss", "Balazs");
        myFunctionC2.apply("Jack", "Daniel");
        myFunctionC3.apply("John", "Whites");


        // MyFunctionD
        MyFunctionD myFunctionD = (firstname) -> firstname.replace("a", "b").toLowerCase();

        String string = myFunctionD.apply("This is a test sample");
        System.out.println(string);


        // MyFunctionE
        MyFunctionD other  = myFunctionD;

        String text = other.apply("This is a test sample");
        System.out.println(text);
    }
}
