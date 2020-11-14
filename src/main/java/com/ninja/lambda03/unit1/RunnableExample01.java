package com.ninja.lambda03.unit1;

public class RunnableExample01 {

    public static void main(String[] args) {

        // Inline anonymous inner class
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });

        thread.run();


        // Lambda expression implements Runnable.run() function
        Thread lambdaThread = new Thread(() -> System.out.println("Printed inside lambda Runnable"));

        lambdaThread.run();

    }
}
