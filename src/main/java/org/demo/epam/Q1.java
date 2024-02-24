package org.demo.epam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(largestWord());
    }

    private static String largestWord() {
        String test =
                "Welcome to the EPAM Interview process";

        return Arrays.stream(test.split(" "))
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(1)
                .collect(Collectors.joining());
    }

}
