package com.ninja.generics01;

public class Torolheto {

    public static void main(String[] args) {

        Barmi<String> barmi = (String string) -> string.startsWith("M");

        doIt("Test", barmi);
        doIt("Test", barmi);
        doIt("Moss", barmi);

        Barmi<Integer> integerBarmi = (Integer integer) -> integer > 0;

        doIt( 10, integerBarmi);
        doIt(-10, integerBarmi);
        doIt( 11, integerBarmi);


    }

    public static void doIt(String string, Barmi condition) {
        if (condition.test(string)) {
            System.out.println("This is the word " + string);
        }
    }

    public static void doIt(Integer integer, Barmi condition) {
        if (condition.test(integer)) {
            System.out.println("This is the value " + integer);
        }
    }
}
