package com.ninja.lambda03.unit5;

public class ThisReferenceExample {

    public static void main(String[] args) {

        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        // with Lambda
        thisReferenceExample.doProcess(10, x -> System.out.println(x + 10));



        // with Anonymous Inner Class
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i is " + i);
                System.out.println(this); // this is the new Process which is an Anonymous Inner Class
            }

            @Override
            public String toString() {
                return "This is the Anonymous Inner Class " + this.hashCode();
            }
        });

    }

    public void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
