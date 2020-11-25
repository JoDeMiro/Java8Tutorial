package com.ninja.stream06;

import java.awt.*;
import java.util.function.Function;
import java.util.stream.Stream;

class Camera {
    private Function<Color, Color> filter;

    public Camera(Function<Color, Color>... filters) {
        filter = input -> input;

        // Solution 1
        for (Function<Color, Color> someFilter : filters) {
            filter = filter.andThen(someFilter);
        }

        // Solution 2
        filter = Stream.of(filters).reduce(input -> input, (someFilter, result) -> result.andThen(someFilter));

        // Solution 3
        filter = Stream.of(filters).reduce(Function.identity(), (someFilter, result) -> result.andThen(someFilter));

        // Solution 4
        filter = Stream.of(filters).reduce(Function.identity(), Function::andThen);

        // All of these are the same
    }

    public Color snap(Color input) {
        // return input;
        return filter.apply(input);
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        printIt(new Camera());
        printIt(new Camera(color -> color.brighter()));
        printIt(new Camera(color -> color.darker()));
        printIt(new Camera(color -> color.brighter(), color -> color.darker()));
    }

    public static void printIt(Camera camera) {
        System.out.println(camera.snap(new Color(120, 120, 120)));
    }
}
