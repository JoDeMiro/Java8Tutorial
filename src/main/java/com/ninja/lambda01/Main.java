package com.ninja.lambda01;

import java.util.concurrent.Callable;

public class Main {

    public static int j = 0;

    public static void main(String[] args) {

        Torolheto torolheto1 = new Torolheto() {
            @Override
            public int multiple(int a, int b) {
                return a * b;
            }
        };

        int e1 = torolheto1.multiple(10, 20);
        System.out.println(e1);


        Torolheto torolheto2 = (a, b) -> {
            return a * b;
        };

        int e2 = torolheto2.multiple(10, 20);
        System.out.println(e2);


        Torolheto torolheto3 = (a, b) -> a * b;
        int e3 = torolheto3.multiple(10, 20);
        System.out.println(e3);

        Runnable runnable = () -> System.out.println(20 * 10);
        runnable.run();

        Runnable runnable1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };
        runnable1.run();

        Proba proba = new Proba() {
            @Override
            public int apply(Object o, Object o2) {
                return ((int)o * (int)o2);
            }
        };

        int apply = proba.apply(10, 20);
        System.out.println(apply);

        Proba proba1 = (a, b) -> (int)a * (int)b;
        int apply1 = proba1.apply(10, 20);
        System.out.println(apply1);

        Proba proba2 = (a, b) -> (int)a - (int)b;
        int apply2 = proba2.apply(10, 20);
        System.out.println(apply2);


        Test test = new Test() {
            @Override
            public int apply(int a, int b) {
                return a * b;
            }
        };

        int t1 = test.apply(10, 20);
        System.out.println(t1);

        Test test1 = (a, b) -> a * b * a;
        int t2 = test1.apply(10, 20);
        System.out.println(t2);

        Test test2 = (a, b) -> a * b * a - b;
        int t3 = test2.apply(10, 20);
        System.out.println(t3);


        Runnable runnable2 = () -> {
            for (int i = 0; i < 10; i++) {
                j = j + i;
            }
        };

        System.out.println(j);
        runnable2.run();
        System.out.println(j);

        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 10 * 10;
            }
        };

        try {
            Integer c1 = callable.call();
            System.out.println(c1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Callable<Integer> callable1 = () -> 10 * 10;

        try {
            Integer c2 = callable1.call();
            System.out.println(c2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

interface Proba<T, U> {
    public int apply(T t, U u);
}

interface Test {
    public abstract int apply(int a, int b);
}