package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FiltersEg {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evens = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evens); // [2, 4, 6]
        List<String> names = Arrays.asList("Sneha", "Ravi", "Sam", "Kiran");

        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("S"))
                .collect(Collectors.toList());

        System.out.println(filtered); // [Sneha, Sam]

        List<String> longNames = names.stream()
                .filter(name -> name.length() > 4)
                .collect(Collectors.toList());

        System.out.println(longNames);
        List<String> values = Arrays.asList("Java", "", null, "Stream", " ");

        List<String> valid = values.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .collect(Collectors.toList());

        System.out.println(valid); // [Java, Stream]

        List<Student> students = Arrays.asList(
                new Student("Sneha", 85),
                new Student("Ravi", 60),
                new Student("Kiran", 90)
        );

        List<Student> toppers = students.stream()
                .filter(s -> s.marks > 75)
                .collect(Collectors.toList());

        toppers.forEach(s -> System.out.println(s.name)); // Sneha, Kiran

        //✅ 7. Filter Duplicate Elements Using distinct()
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");

        List<String> unique = items.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unique); // [apple, banana, orange]
//✅ 8. Filter Based on Custom Predicate
        Predicate<String> isLong = str -> str.length() > 5;

        List<String> words = Arrays.asList("hello", "stream", "function", "java");

        List<String> longWords = words.stream()
                .filter(isLong)
                .collect(Collectors.toList());

        System.out.println(longWords); // [stream, function]


    }
}
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}