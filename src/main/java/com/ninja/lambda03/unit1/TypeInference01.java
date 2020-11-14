package com.ninja.lambda03.unit1;

public class TypeInference01 {

    private static String text = "This is my example";

    public static void main(String[] args) {

        Lambda lambda = (String x) -> x.length();

        int length = lambda.getLength(text);

        System.out.println(length);

    }

    interface Lambda {
        int getLength(String string);
    }

}
