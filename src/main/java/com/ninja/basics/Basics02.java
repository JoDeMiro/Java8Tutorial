package com.ninja.basics;

public class Basics02 {

    int id;
    String name;

    public Basics02(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        Basics02 instance1 = new Basics02(1, "First");
        Basics02 instance2 = new Basics02(2, "Second");

        Basics02 instance3 = instance1;

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);

    }
}
