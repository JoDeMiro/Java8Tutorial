package com.ninja.stream06;

import java.util.function.*;

class Lazy<T> {
    private T instance;
    private Supplier<T> supplier;

    public Lazy(Supplier<T> theSupplier) {
        supplier = theSupplier;
    }

    public T get() {
        if (instance == null) {
            instance = supplier.get();
            supplier = null;
        }
        return instance;
    }
}


public class LazyEvaluation {

    public static void main(String[] args) {
        int x = 14;
        Lazy<Integer> y = new Lazy<Integer>(() -> compute(x));

        System.out.println("Here...");

        if( x > 5 && y.get() > 7)
            System.out.println("Path 1");
        else
            System.out.println("Path 2");
    }


    public static int compute(int n) {
        System.out.println("Compute method has been called");
        return n * 2;
    }

}
