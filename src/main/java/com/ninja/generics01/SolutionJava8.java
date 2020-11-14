package com.ninja.generics01;

public class SolutionJava8 {

    public static void main(String[] args) {

        Barmi<String> barmi = (String string) -> string.startsWith("M");

        doIt("Test", barmi);
        doIt("Test", barmi);
        doIt("Mass", barmi);

    }

    public static void doIt(String string, Barmi<String> condition) {
        if (condition.test(string)) {
            System.out.println("This is the word " + string);
        }
    }
}
