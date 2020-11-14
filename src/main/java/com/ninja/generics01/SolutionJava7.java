package com.ninja.generics01;

public class SolutionJava7 {

    public static void main(String[] args) {

        Barmi<String> barmi = new Barmi<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("M");
            }
        };

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
