package org.example.newconcept.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                concurrentMap.put("key" + i, i);
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                concurrentMap.computeIfPresent("key" + i, (key, value) -> value + 1);
            }
        };

        Runnable task3 = () -> {
            for (int i = 0; i < 1000; i++) {
                concurrentMap.computeIfAbsent("key" + i, key -> 0);
            }
        };

        executor.execute(task1);
        executor.execute(task2);
        executor.execute(task3);

        executor.shutdown();

        // Wait until all tasks are finished
        while (!executor.isTerminated()) {
        }

        System.out.println("Final size of the ConcurrentHashMap: " + concurrentMap.size());
        System.out.println("Sample value for key500: " + concurrentMap.get("key500"));

    }
}
