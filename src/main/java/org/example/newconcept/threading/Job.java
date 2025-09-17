package org.example.newconcept.threading;
/*
* We can extend thread class or implement runnable to run the method called run() method
*
* */
public class Job extends Thread{

    private int number;
    public Job(int number){
        this.number=number;
    }

    public void run(){
        System.out.println("Task "+number+" started");
        for(int i=number*100;i<=number*100+99;i++){
            System.out.print(i+" ");
        }
        System.out.println("\nTask "+number+" done");
    }

    public static void main(String[] args) {
        Job job=new Job(1);
        job.start();
    }
}


