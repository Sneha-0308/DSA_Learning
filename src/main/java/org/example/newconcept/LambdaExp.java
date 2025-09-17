package org.example.newconcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExp {
    public static void main(String[] args) {
//        🔸 Use Case: Iterating over a list ✅ 1. Collections and Iteration
        List<String> names= Arrays.asList("Sneha","Mana","Ruby");
//        names.forEach(System.out::println);
        // Traditional way
        for (String name : names) {
            System.out.println(name);
        }

        // Lambda way
        names.forEach(name -> System.out.println(name));


    //✅ 2. Sorting Collections
        names.sort((a,b)->a.length()-b.length());
        System.out.println(names);

        //✅ 3. Filtering Collections with Streams
        List<String> filtered=names.stream()
                .filter(name->name.startsWith("S"))
                .collect(Collectors.toList());
        System.out.println(filtered);
    }
}
