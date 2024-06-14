package org.example.newconcept.threading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallbleAnyRunner {
    /**
     * invoke any method is used to get the fastest executed task it will return
     * and close thread once it get any one task executed.
     * ~~~~~important note~~~~: number of thread should be as many task are there those many
     * thread we need to mention. because if you have 10 task but if you mention 5
     * thread it will only consider the task between 5 not all
     */


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<CallableTask> tasks=List.of(new CallableTask("task1"),new CallableTask("task2"),new CallableTask("task3"),new CallableTask("task4"));
        ExecutorService executorService= Executors.newFixedThreadPool(4);
        String task=executorService.invokeAny(tasks);
        System.out.println(task);
        executorService.shutdown();
    }
}
