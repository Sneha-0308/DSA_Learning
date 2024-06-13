package org.example.newconcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamConcept {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Convert all strings to uppercase and filter strings starting with 'A'
        List<String> result = myList.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
