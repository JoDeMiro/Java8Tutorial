package com.ninja.lambda03.unit6;

public class MethodReferenceExample04 {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                printMessage();
            }
        };

        Thread thread = new Thread(runnable);

        thread.start();

        thread.run();       // This calls the runnable.run() method

        runnable.run();


    }

    public static void printMessage() {
        System.out.println("Hello World");
    }
}
