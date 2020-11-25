package com.ninja.stream06;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ReduceExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(totalValue(numbers));

        // sum
        Integer sumSolution1 = numbers.stream().reduce(0, (Integer a, Integer b) -> a + b);
        System.out.println(sumSolution1);

        // even sum
        System.out.println(evenValue(numbers));

        // even sum
        Predicate<Integer> evenNumber = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 == 0) {
                    return true;
                }
                return false;
            }
        };
        System.out.println(selectedValue(numbers, evenNumber));

        // even num
        Predicate<Integer> evenLambda = x -> x % 2 == 0;
        System.out.println(selectedValue(numbers, evenLambda));

        // even num
        System.out.println(selectedValue(numbers, x -> x % 2 == 0));

        // odd num
        System.out.println(selectedValue(numbers, x -> x % 2 == 1));

        // even sum
        System.out.println(filteredValue(numbers, x -> x % 2 == 0));

        // sum
        System.out.println(filteredValue(numbers, x -> true));

        // sum
        System.out.println(numbers.stream().filter(x -> true).mapToInt(x -> x).sum());


    }

    private static int totalValue(List<Integer> values) {
        int total = 0;
        for (Integer value : values) {
            total += value;
        }
        return total;
    }

    private static int evenValue(List<Integer> values) {
        int total = 0;
        for (Integer value : values) {
            if (value % 2 == 0) {
                total += value;
            }
        }
        return total;
    }

    private static int selectedValue(List<Integer> values, Predicate<Integer> predicate) {
        int total = 0;
        for (Integer value : values) {
            if (predicate.test(value)) {
                total += value;
            }
        }
        return total;
    }

    private static int filteredValue(List<Integer> values, Predicate<Integer> predicate) {
        return values.stream().filter(predicate).mapToInt(e -> e).sum();
    }
}
