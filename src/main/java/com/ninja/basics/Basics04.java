package com.ninja.basics;

import java.util.Arrays;

public class Basics04 {
    public static void main(String[] args) {

        {
            // sample 1
            int sum = addNumber(10);
            System.out.println(sum);
        }
        {
            // sample 2
            int sum = addNumber(10, 20, 30);
            System.out.println(sum);
        }
        {
            // sample 3
            int sum = sumNumber(10, 20, 30, 40, 50);
            System.out.println(sum);
        }
        {
            // sample 4
            int sum = sumFunction(10, 20, 30, 40, 50, 60, 70);
            System.out.println(sum);
        }
    }

    public static int addNumber(Integer... integers) {
        int total = 0;
        for (Integer integer : integers) {
            total += integer;
        }
        return total;
    }

    public static int sumNumber(Integer... integers) {
        return Arrays.stream(integers).reduce(0, (a, b) -> a + b).intValue();
    }

    public static int sumFunction(Integer... integers) {
        return Arrays.stream(integers).mapToInt(e -> e).sum();
    }
}
