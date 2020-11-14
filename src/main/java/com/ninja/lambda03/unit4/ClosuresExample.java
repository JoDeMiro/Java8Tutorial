package com.ninja.lambda03.unit4;

public class ClosuresExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // with Anonymous Inner Class
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i + b);
            }
        });

        // with Lambda
        doProcess(a, x -> System.out.println(x + b));

    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
