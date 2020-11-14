package com.ninja.function01;

import java.util.function.Function;

public class Function01 {
    public static void main(String[] args) {

        //
        int increment = increment(1);
        System.out.println(increment);

        //
        int increment_ = incrementByOneFunction.apply(1);
        System.out.println(increment_);

        //
        Function<Integer, Integer> chainFunction = incrementByOneFunction.andThen(multipleBy10);
        int increment__ = chainFunction.apply(2);
        System.out.println(increment__);
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multipleBy10 = number -> number * 10;

    static int increment(int number) {
        return number + 1;
    }
}
