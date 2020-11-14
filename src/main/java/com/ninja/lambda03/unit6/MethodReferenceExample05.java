package com.ninja.lambda03.unit6;

public class MethodReferenceExample05 {

    public static void main(String[] args) {

        // with Anonymous Inner Class
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printMessage();
            }
        });


        // with Lambda expression
        Thread t2 = new Thread(() -> printMessage());


        t1.start();
        t2.start();

    }

    public static void printMessage() {
        System.out.println("Hello World");
    }
}
