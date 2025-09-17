package org.example.newconcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatFun {
    //stream.map(element -> transformedElement)
    //stream.flatMap(element -> streamOfElements)
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sneha", "ravi");

        List<String> upperNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(upperNames); // [SNEHA, RAVI]
        List<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lengths); // [5, 4]

        //flat map
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Java", "Spring"),
                Arrays.asList("AWS", "Docker")
        );

        List<String> flatList = nestedList.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(flatList); // [Java, Spring, AWS, Docker]

        List<String> words = Arrays.asList("Java", "Code");

        List<Character> characters = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());

        System.out.println(characters); // [J, a, v, a, C, o, d, e]

    }
}

/**
 * | Feature     | `map()`                                    | `flatMap()`                                   |
 * | ----------- | ------------------------------------------ | --------------------------------------------- |
 * | Use case    | One-to-one transformation                  | One-to-many transformation                    |
 * | Return type | Stream of objects                          | Flattened stream                              |
 * | Result type | `Stream<Stream<T>>` (if mapping to stream) | `Stream<T>` after flattening                  |
 * | Example     | Convert string to uppercase                | Split string into characters (flatten result) |
 */