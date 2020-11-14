package com.ninja.lambda03.unit3;

import java.util.function.BiConsumer;

public class BiFunctionExample {

    public static void main(String[] args) {

        int numberArray[] = {1, 2, 3, 4, 5};
        int key = 2;

        process(numberArray, key);

        processLambda(numberArray, key, (v, k) -> System.out.println(v + k));

        processLambda(numberArray, key, (v, k) -> System.out.println(v - k));

        processLambda(numberArray, key, (v, k) -> System.out.println(v * k));

        processLambda(numberArray, key, (v, k) -> System.out.println(v / k));

    }

    public static void process(int[] numberArray, int key) {
        for (int i : numberArray) {
            System.out.println(i + key);
        }
    }

    public static void processLambda(int[] numberArray, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : numberArray) {
            consumer.accept(i, key);
        }
    }
}