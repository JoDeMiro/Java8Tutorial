package com.ninja.lambda03.unit6;

public class MethodReferenceExample07 {

    public static void main(String[] args) {

        // Simple static method
        printMessage();

        // New Thread with Lambda implementation of Runnable Interface
        Thread t = new Thread(() -> printMessage());

        // Start the thread
        t.start();

    }

    public static void printMessage() {
        System.out.println("Hello World");
    }
}
