package com.ninja.consumer01;

import java.util.function.Consumer;

public class Consumer01 {
    public static void main(String[] args) {

        Customer ninja = new Customer("Ninja", "+3640 600 500");

        //
        // Normal java function
        greetCustomer(ninja);

        //
        // Consumer Functional interface
        greetCustomerConsumer.accept(ninja);
    }

    //
    // Consumer Functional interface
    static Consumer<Customer> greetCustomerConsumer = customer -> {
        System.out.println("Hello " + customer.customerName + " from " + customer.customerPhoneNumber);
    };

    //
    // Normal java function
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + " from " + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
