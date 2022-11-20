package com.ninja.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Singleton {

    private static final Logger log = LoggerFactory.getLogger(Singleton.class);

    private static Singleton instance;

    private String name;

    private Singleton() {
        name = "Joe De Miro";
    }

    /**
     * The getInstance() method returns a reference to a Singleton object, which can be used to execute S OLE methods.
     * This method returns a singleton, so calling it twice in a row will return the same instance.
     *
     * @return Singleton
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private void print() {
        System.out.println(instance.name);
    }

    // https://github.com/jagin/jamibroker/blob/master/src/main/java/pl/jagin/jamibroker/JAmiBroker.java

    public static void main(String[] args) {

        Singleton context = Singleton.getInstance();

        context.print();
    }
}
