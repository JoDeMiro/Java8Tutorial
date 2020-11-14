package com.ninja.lambda03.unit6;

import java.util.function.Consumer;

public class MethodReferenceExample09 {

    public static void main(String[] args) {

        printMessage("Hello World", (x) -> System.out.println(x));

    }

    public static void printMessage(String message, Consumer<String> consumer) {
        consumer.accept(message);
    }
}
