package com.ninja.lambda03.unit6;

public class MethodReferenceExample06 {

    public static void main(String[] args) {

        // with Anonymous Inner Class
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                printMessage();
            }
        };


        // with Lambda
        Runnable runnable2 = () -> printMessage();


        runnable1.run();
        runnable2.run();

    }

    public static void printMessage() {
        System.out.println("Hello World");
    }
}
