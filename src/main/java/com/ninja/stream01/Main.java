package com.ninja.stream01;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        List<Pumpkin> pumpkins = new ArrayList<Pumpkin>();

        pumpkins.add(new Pumpkin(10, 10));
        pumpkins.add(new Pumpkin(20, 20));
        pumpkins.add(new Pumpkin(30, 30));

        int sum = pumpkins.stream().mapToInt(x -> x.getSize()).sum();
        OptionalDouble average = pumpkins.stream().mapToDouble(x -> x.getSize()).average();
        int[] weights = pumpkins.stream().mapToInt(x -> x.getSize() * x.getRadius()).toArray();

        for (int weight : weights) {
            System.out.println(weight);
        }

        System.out.println("sum = " + sum);
        System.out.println("average = " + average.getAsDouble());
    }
}
