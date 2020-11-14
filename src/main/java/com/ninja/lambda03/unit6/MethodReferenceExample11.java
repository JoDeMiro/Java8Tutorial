package com.ninja.lambda03.unit6;

import java.util.function.Consumer;

public class MethodReferenceExample11 {

    public static void main(String[] args) {

        // with Lambda
        printMessage("Hello ", "World", x -> System.out.println(x));

        // with Method Reference
        printMessage("Hello ", "World", System.out::println);

        // with Method Reference
        print1("Üzenet", MethodReferenceExample11::print);

    }

    public static void printMessage(String k, String v, Consumer<String> consumer) {
        consumer.accept(k + v);
    }

    public static void print1(String s, Consumer<String> consumer) {
        consumer.accept(s);
    }

    public static void print(String string) {
        System.out.println(string);
    }

}
