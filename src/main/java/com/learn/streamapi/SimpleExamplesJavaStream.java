package com.learn.streamapi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimpleExamplesJavaStream {
    public static void main(String[] args) {


        // using IntStream class with range and for each
        IntStream
                .range(1,10)
                .forEach(x -> System.out.println(x));

        // using Stream.of, sorted and findFirst
        Stream.of("Mayank", "Malpani", "playing", "StreamApi")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        //using Stream from an Array, sort, filter and print
        String[] words = {"Mayank", "Malpani", "playing", "StreamApi"};
        Arrays.stream(words)  // also couldve used Stream.of(names)
                .filter(x -> x.startsWith("M"))
                .sorted()
                .forEach(System.out::println);


        // avg of squares of an int array
        Arrays.stream(new int[] {4, 45, 9, 76, 2, 3, 55})
                .map(x -> x * x )
                .average()
                .ifPresent(System.out::println);

        // Stream from a list, filter and print
        List<String> people = Arrays.asList("Mayank", "Malpani", "playing", "StreamApi");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("m"))
                .forEach(System.out::println);

    }
}
