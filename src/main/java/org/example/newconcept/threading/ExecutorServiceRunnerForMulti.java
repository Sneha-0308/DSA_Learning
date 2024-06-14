package org.example.newconcept.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunnerForMulti {
    public static void main(String[] args){
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.execute(new Job(1));
        executorService.execute(new Job(2));
        executorService.execute(new Job(3));
        executorService.execute(new Job(4));
        executorService.shutdown();
    }
}
