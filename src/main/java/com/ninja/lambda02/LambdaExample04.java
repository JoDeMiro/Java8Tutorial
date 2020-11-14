package com.ninja.lambda02;

public class LambdaExample04 {

    private static String classVariable = "Class Variable String ";

    private String instanceVariable = "Instance Variable String ";

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


        // Outside member variable in lambda expression
        MyFunctionB myFunctionB3 = string -> {
            System.out.println(classVariable + string);
        };

        myFunctionB3.apply("Hello class variable");

        // This can be overwritten
        classVariable = "New value ";

        myFunctionB3.apply("Hello class variable");


        // Instance variable can not be called inside the lambda, because the main method is static
        MyFunctionB myFunctionB4 = string -> {
            // System.out.println(this.instanceVariable + string);
        };

        // Lambda can contain instance variable only if the class has been instantiated
        LambdaExample04 lambdaExample04 = new LambdaExample04();
        lambdaExample04.doIt();

        // Lambda gets variable from the method
        lambdaExample04.doIt("Parameter");
    }

    private void doIt() {
        MyFunctionB myFunctionB5 = string -> {
            System.out.println(instanceVariable + string);
        };

        myFunctionB5.apply("Do It");
    }

    private void doIt(String parameter) {
        MyFunctionB myFunctionB5 = string -> {
            System.out.println(instanceVariable + string + parameter);
        };

        myFunctionB5.apply("Kuty-Kuty ");
    }
}
