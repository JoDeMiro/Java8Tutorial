package com.ninja.lambda02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class LambdaExample02 {

    public static void main(String[] args) throws FileNotFoundException {

        // In lambda the interface can contain many methods, but only one abstract, unimplemented method.
        // So here is an example
        MyInterface myInterface = (String string) -> {
            System.out.println("Hello " + string);
        };

        myInterface.printIt("Joe De Miro");


        // But you can use the default method as well
        myInterface.printUtf8To("Hello Joe De Miro", new FileOutputStream("text.txt"));

        // Static method is available directly just as any static method
        MyInterface.printItToSystemOut("Hello Static method");

        // Java lambda expression

    }
}
