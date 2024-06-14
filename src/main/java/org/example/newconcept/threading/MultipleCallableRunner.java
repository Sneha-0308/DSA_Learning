package org.example.newconcept.threading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        List<CallableTask> tasks=List.of(new CallableTask("task1"),new CallableTask("task2"),new CallableTask("task3"),new CallableTask("task4"));

        List<Future<String>> invokeAll=executorService.invokeAll(tasks);
        invokeAll.forEach(future-> {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.shutdown();
    }
}
