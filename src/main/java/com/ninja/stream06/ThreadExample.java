package com.ninja.stream06;

public class ThreadExample {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {                                     // with Anonymous Inner Class
            @Override
            public void run() {
                System.out.println("In another thread");
            }
        });


        Thread threadLambda = new Thread(() -> System.out.println("In lambda thread")); // with Lambda


        thread.start();                                                                 // start thread
        threadLambda.start();                                                           // start another thread

        System.out.println("In main thread");
    }
}
