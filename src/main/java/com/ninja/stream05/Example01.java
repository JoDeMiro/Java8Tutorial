package com.ninja.stream05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example01 {

    public static void main(String[] args) throws IOException {

        // 1. Integer Stream
        IntStream.range(1, 10).forEach(System.out::print);

        // 2. Integer Stream with skip
        IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));

        // 3. Integer Stream with sum
        System.out.println(IntStream.range(1, 10).sum());

        // 4.
        Stream.of("Loren", "Mazsi", "Coyote").sorted().findFirst().ifPresent(System.out::println);

        // 5.
        String[] names = {"Loren", "Mazsi", "Coyote"};
        Arrays.stream(names).filter(x -> x.contains("o")).sorted().forEach(System.out::println);

        // 6.
        Stream.of(names).filter(x -> x.length() > 3).sorted().forEach(System.out::println);

        // 7.
        Arrays.stream(new int[]{2, 4, 6, 8, 10}).map(x -> x * x).average().ifPresent(System.out::println);

        // 8.
        IntStream.of(new int[]{2, 4, 6, 8, 10}).map(x -> x * x).average().ifPresent(System.out::println);

        // 9.
        List<String> people = Arrays.asList("Alan", "John", "Josh", "Jack", "Jim", "Joe");
        people.stream().map(String::toLowerCase).filter(x -> x.startsWith("j")).forEach(System.out::println);

        // 10.
        List<Dog> dogs = Arrays.asList(new Dog("Mazsi", "Vera"), new Dog("Loren", "Bridge"));
        dogs.stream().map(x -> x.getName().trim()).filter(y -> y.startsWith("M")).forEach(System.out::println);

        // 11.
        Stream<String> colors = Files.lines(Paths.get("colors.txt"));
        colors.sorted().filter(x -> x.length() > 3).forEach(System.out::println);
        colors.close();

        // 12. .collect(Collectors.toList()) return with a List<>
        Stream<String> color = Files.lines(Paths.get("colors.txt"));
        List<String> stringList = color
                .filter(x -> x.contains("a"))
                .sorted()
                .collect(Collectors.toList());
        stringList.forEach(System.out::println);

        // 13. Stream rows from CSV file -> count
        Stream<String> rowLines = Files.lines(Paths.get("data.txt"));
        long rowCount = rowLines
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount);
        rowLines.close();

        // 14. Stream rows from CSV file -> parse data from rows
        Stream<String> rowLines1 = Files.lines(Paths.get("data.txt"));
        rowLines1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
        rowLines1.close();

        // 15. Stream rows from CSV file -> store fields in HashMap
        Stream<String> rowLines2 = Files.lines(Paths.get("data.txt"));
        Map<String, Integer> map = new HashMap<>();

        map = rowLines2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])
                ));

        rowLines2.close();
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        // 16. Reduction -> sum
        double total1 = Stream.of(7.3, 1.5, 5.7).reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println(total1);

        // 17. Reduction -> sum
        Integer total2 = Stream.of(1, 2, 3, 4, 5).reduce(0, (Integer a, Integer b) -> a + b);
        System.out.println(total2);

        // 18. Reduction -> sum
        Integer total3 = Stream.of(1, 2, 3, 4, 5).reduce(0, Integer::sum);
        System.out.println(total3);

        // 19. Reduction -> sum
        Integer total4 = Stream.of(1, 2, 3, 4, 5).reduce(1, (Integer a, Integer b) -> a * b);
        System.out.println(total4);

        // 20. Reduction -> summary statistics
        IntSummaryStatistics summary = IntStream.of(1, 2, 3, 4, 5).summaryStatistics();
        System.out.println(summary);

    }
}
