package org.example.newconcept;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 🔹 1. Intermediate Operations (return a Stream)
 * These are lazy and used to build pipelines:
 *
 * .filter() – filters elements
 *
 * .map() – transforms elements
 *
 * .sorted() – sorts elements
 *
 * .distinct() – removes duplicates
 *
 * .limit(n), .skip(n) – limit or skip elements
 *
 * 🔹 2. Terminal Operations (trigger the pipeline)
 * These produce a result:
 *
 * .collect() – collect result into List, Set, etc.
 *
 * .forEach() – perform an action
 *
 * .count(), .min(), .max(), .findFirst(), .allMatch(), etc.
 */
public class AboutStream {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Sneha","Sam","Rahul","Mana","Nethra","Chaitanya","M");
        names.stream()                            // create stream
                .filter(name -> name.startsWith("S")) // intermediate
                .map(String::toUpperCase)             // intermediate
                .forEach(System.out::println);        // terminal

        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
        List<Integer> evens=numbers.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(evens);

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        List<String> upper = names.stream()
                .map(String::toUpperCase) //::method reference
                .collect(Collectors.toList());

        System.out.println(upper);
        names.sort((a,b)->a.length()-b.length());
        System.out.println(names);

//        🔸 3. Sort names by length
        names.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }


}
/**
 * Method reference is a compact way of referring to a method of functional interface. It is used to refer to a method without invoking it. :: (double colon) is used for describing the method reference. The syntax is class::methodName
 *
 * For e.g.:
 *
 * Integer::parseInt(str) \\ method reference
 *
 * str -> Integer.ParseInt(str); \\ equivalent lambda
 */
