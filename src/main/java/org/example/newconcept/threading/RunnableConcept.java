package org.example.newconcept.threading;

public class RunnableConcept implements Runnable {
    public void run(){
        System.out.println("Thread is running/......");
    }

    public static void main(String[] args) {
        RunnableConcept runnableConcept=new RunnableConcept();
        Thread thread=new Thread(runnableConcept);
        thread.start();
    }
}

