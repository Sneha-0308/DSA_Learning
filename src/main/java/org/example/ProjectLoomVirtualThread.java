package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProjectLoomVirtualThread {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(200); // limited
        for (int i = 0; i < 10_000; i++) {
            int finalI = i;
            executor.submit(() -> {
                // Blocking I/O call
                System.out.println("finalI = " + finalI);
                Thread.sleep(1000);
                return "done";
            });
        }

    }
}
