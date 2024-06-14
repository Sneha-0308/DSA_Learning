package org.example.newconcept.threading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Future<String> welcomeFuture = executorService.submit(new CallableTask("callable task-1"));
        String welcomeMessage=welcomeFuture.get();
        System.out.println(welcomeMessage);
        System.out.println("New callable task (callable task-1) executed");
        System.out.println("main completed");
        executorService.shutdown();
    }
}
