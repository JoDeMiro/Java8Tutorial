package com.ninja.lambda03.unit1;

public class TypeInference03 {

    private static String text = "This is my example";

    public static void main(String[] args) {

        printLambda( x -> x.length() );

    }

    public static void printLambda(Lambda lambda) {
        System.out.println(lambda.getLength(text));
    }

    interface Lambda {
        int getLength(String string);
    }

}
