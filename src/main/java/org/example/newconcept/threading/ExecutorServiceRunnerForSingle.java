package org.example.newconcept.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunnerForSingle {
    public static void main(String[] args){

        /*In this case we have created executor service for single thread if you want to
        * create new thread from same instance then use new Thread class while calling execute
        * */

        ExecutorService executorService= Executors.newSingleThreadExecutor();
        executorService.execute(new Job(1));
        executorService.execute(new Thread(new Job(2)));
        System.out.println("main function job kicked off");
        for(int i=301;i<=399;i++){
            System.out.print(i+ " ");
        }
        System.out.println("\n main task done");
        executorService.shutdown();
    }
}
