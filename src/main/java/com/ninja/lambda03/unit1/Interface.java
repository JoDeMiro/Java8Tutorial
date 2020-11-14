package com.ninja.lambda03.unit1;

@FunctionalInterface
public interface Interface {
    public void doIt();

    // @FunctionalInterface annotation makes it available to remember the developer that this
    // Interface is a functional interface so it can have one and only one abstract method.

    // Every interface is a functional interface as long as it has only one abstract method.
    // But this annotation enforce the developer to use only one abstract interface.
}
