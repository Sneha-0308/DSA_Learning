package org.example.newconcept.threading;

public class ThreadJoin {
    public static void main(String[] args) {
        WorkThread thread1=new WorkThread("Task 1");
        WorkThread thread2=new WorkThread("Task 2");
        thread1.start();
        thread2.start();
        try{
            // Wait for thread1 to complete before proceeding
            thread2.join();
            // Wait for thread2 to complete before proceeding
            thread1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Both tasks are completed. Main thread proceeding.");

    }
}
class WorkThread extends Thread{
    private String taskName;
    public WorkThread(String taskName){
        this.taskName=taskName;
    }
    @Override
    public void run(){
        System.out.println(taskName + " started. ");
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(taskName+ " completed. ");
    }
}
