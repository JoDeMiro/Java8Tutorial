package com.ninja.stream06;

import java.util.function.Function;

public class DecoratorExample {
    public static void main(String[] args) {

        //
        Function<Integer, Integer> incremental = e -> e + 1;

        printIt(10, "Incremented", incremental);

        //
        Function<Integer, Integer> doubled = e -> e * 2;

        printIt(10, "Doubled", doubled);

        //

        printIt(10, "Incremented then Doubled", incremental.andThen(doubled));
    }

    public static void printIt(int n, String message, Function<Integer, Integer> function) {
        System.out.println(n + " " + message + " : " + function.apply(n));
    }
}
