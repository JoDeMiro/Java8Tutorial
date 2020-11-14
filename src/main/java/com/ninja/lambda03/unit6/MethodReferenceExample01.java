package com.ninja.lambda03.unit6;

public class MethodReferenceExample01 {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                printMessage();
            }
        });

        thread.run();

    }

    public static void printMessage() {
        System.out.println("Hello World");
    }
}
