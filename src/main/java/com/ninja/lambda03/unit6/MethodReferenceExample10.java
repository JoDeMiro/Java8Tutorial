package com.ninja.lambda03.unit6;

import java.util.function.Consumer;

public class MethodReferenceExample10 {

    public static void main(String[] args) {

        // with Lambda
        printMessage("Hello World", x -> System.out.println(x));

        // with Method Reference
        printMessage("Hello World", System.out::println);

    }

    public static void printMessage(String message, Consumer<String> consumer) {
        consumer.accept(message);
    }
}
