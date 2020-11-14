package com.ninja.predicate01;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate02 {

    public static void main(String[] args) {

        List<String> phoneNumbers = new ArrayList<>();

        phoneNumbers.add("+36 12345");
        phoneNumbers.add("+40 12345");
        phoneNumbers.add("+36 01234");

        //
        // Normal java function
        for (String phoneNumber : phoneNumbers) {
            System.out.println(isPhoneNumberValid(phoneNumber));
        }

        //
        // Predicate Functional interface
        for (String phoneNumber : phoneNumbers) {
            System.out.println(isPhoneNumberValidPredicate.test(phoneNumber));
        }

        //
        // With Stream API
        phoneNumbers.stream().filter(isPhoneNumberValidPredicate).forEach(System.out::println);

        //
        // With Stream API -> static isPhoneNumberValid normal java method
        phoneNumbers.stream().filter(Predicate02::isPhoneNumberValid).forEach(System.out::println);
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+36") && phoneNumber.length() == 9;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
        phoneNumber.startsWith("+36") && phoneNumber.length() == 9;

}
