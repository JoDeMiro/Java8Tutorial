package com.ninja.lambda03.unit6;

public class MethodReferenceExample08 {

    public static void main(String[] args) {

        // Simple static method
        printMessage();

        // New Thread with Lambda implementation of Runnable Interface
        Thread t = new Thread(() -> printMessage());

        // Start the thread
        t.start();


        // Method Reference
        // When the called method has no input argument
        Thread x = new Thread(MethodReferenceExample08::printMessage);

        // Start the thread
        x.start();

    }

    public static void printMessage() {
        System.out.println("Hello World");
    }
}
