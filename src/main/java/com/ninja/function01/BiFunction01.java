package com.ninja.function01;

import java.util.function.BiFunction;

public class BiFunction01 {
    public static void main(String[] args) {

        //
        Integer result = incrementByOneAndMultiple(1, 10);
        System.out.println(result);

        //
        Integer result_ = incrementByOneAndMultiplyBiFunction.apply(1, 10);
        System.out.println(result_);
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (n, m) -> (n + 1) * m;

    static Integer incrementByOneAndMultiple(int n, int m) {
        return (n + 1) * m;
    }
}
