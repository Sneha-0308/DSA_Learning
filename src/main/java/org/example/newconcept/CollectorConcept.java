package org.example.newconcept;

import org.example.newconcept.model.UserDetails;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorConcept {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        List<String> stringList1 = stringList.stream().collect(Collectors.toList());
        stringList1.forEach(System.out::println);


        ////TODO:different operation for Collector class
        List<UserDetails> userDetails = new ArrayList<>();
        userDetails.add(new UserDetails("test1", "2324232", "testing"));
        userDetails.add(new UserDetails("test2", "23242323", "development"));
        userDetails.add(new UserDetails("test3", "24897824232", "testing"));
        userDetails.add(new UserDetails("test4", "2324232232", "development"));

        Map<String, List<UserDetails>> groupByDepartment = userDetails.stream()
                .collect(Collectors.groupingBy(UserDetails::getDepartment));
        groupByDepartment.forEach((department, users) -> {
            System.out.println(department);
            users.forEach(user -> System.out.println(user.getName() + "--" + user.getPhone()));
        });


        ////TODO:converting to set
        List<String> listOfFruit = Arrays.asList("apple", "banana", "orange", "banana", "apple");
        Set<String> setOfFruit = listOfFruit.stream().collect(Collectors.toSet());
        setOfFruit.forEach(System.out::println);

        //TODO: arithmetic operation using collectors
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 67);
        IntSummaryStatistics details = number.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(details);

        //TODO:1 partition operation using collectors
        List<Integer> number1 = Arrays.asList(1, 2, 3, 4, 5, 6, 67);
        Map<Boolean, List<Integer>> numberPartition = number1.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        numberPartition.forEach((is, data) -> {
            System.out.println(is ? "EVENT DATA " + data : "ODD DATA " + data);
        });
        //TODO:2 partition operation using collectors
        List<String> stringData = Arrays.asList("apple", "abanana", "orange", "banana", "apple");
        Map<Boolean, List<String>> stringPartition = stringData.stream()
                .collect(Collectors.partitioningBy(s -> s.startsWith("a")));
        stringPartition.forEach((is, data) -> {
                    System.out.println(is ? "sorted DATA " + data : "DATA " + data);
                }

        );
    }
}
