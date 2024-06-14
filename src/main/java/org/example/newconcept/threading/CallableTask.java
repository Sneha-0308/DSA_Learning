package org.example.newconcept.threading;

import java.util.concurrent.Callable;
/**
 * we use callable interface used to return value but if we use thread class we can't return thread value
 * and we can't handle exception. but using callable interface we can return value and also we can handle
 * exception as well.
 *
 */

public class CallableTask implements Callable<String> {
    private String name;
    public CallableTask(String name){
        this.name=name;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello "+name;
    }
}
