package com.ninja.lambda03.unit3;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {

        int numberArray[] = {1, 2, 3, 4, 5};
        int key = 2; // 0 -> throw an exception

        processLambda(numberArray, key, (v, k) -> System.out.println(v + k));

        processLambda(numberArray, key, (v, k) -> System.out.println(v / k));

        processLambda(numberArray, key, wrapperLambda((v, k) -> System.out.println(v / k)));

    }

    public static void processLambda(int[] numberArray, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : numberArray) {
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception caught in wrapper lambda");
            }
        };
    }
}
