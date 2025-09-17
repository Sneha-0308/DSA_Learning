package org.example.newconcept;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorFunc {
    public static void main(String[] args) {
        List<String> names = Stream.of("Sneha", "Ravi", "Kiran")
                .collect(Collectors.toList());
        System.out.println(names); // [Sneha, Ravi, Kiran]

        Set<String> namesSet = Stream.of("A", "B", "A")
                .collect(Collectors.toSet());
        System.out.println(namesSet); // [A, B]

        String result = Stream.of("Java", "is", "fun")
                .collect(Collectors.joining(" "));
        System.out.println(result); // Java is fun

        long count = Stream.of(1, 2, 3, 4)
                .collect(Collectors.counting());
        System.out.println(count); // 4


    }
}
