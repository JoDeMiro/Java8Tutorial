package com.ninja.lambda02;

public class LambdaExample03 {

    public static void main(String[] args) {

        MyFunctionB myFunctionB1 = string -> {
            System.out.println(string);
        };

        myFunctionB1.apply("Hello MyFunctionB1");


        // Outside member variable in lambda expression
        final String otherString = "Hello other string ";

        MyFunctionB myFunctionB2 = string -> {
            System.out.println(otherString + string);
        };

        myFunctionB2.apply("Hello MyFunctionB2");

        // It is only possible when 'otherString' variable is final or effective final;
        // When you try to assign a new value to the 'otherString' variable then the compiler will complain.

        // otherString = "new value";

    }
}
