package org.example.newconcept.threading;
/**
 *Without Synchronization (Race Condition)==>here the answer should come 2X(number of loop) but it will come less because
 * Due to the lack of synchronization, the final count may be less than 2000 because both threads could simultaneously read
 * the same value of count, increment it, and then write it back, leading to missed increments.
 */
//public class ThreadingInDS {
//
//    public static void main(String[] args) throws InterruptedException {
//        Counter counter=new Counter();
////        create task to use in threading
//        Runnable task=threadTask(counter);
//
//        Thread thread1=new Thread(task);
//        Thread thread2=new Thread(task);
//        System.out.println("thread1 started>>>>>>>>>>>>>>>>>>>>>>>.");
//        thread1.start();
//        System.out.println("thread1 finished>>>>>>>>>>>>>>>>>>>>>>>.");
//        System.out.println("thread2 started>>>>>>>>>>>>>>>>>>>>>>>.");
//        thread2.start();
//        System.out.println("thread2 finished>>>>>>>>>>>>>>>>>>>>>>>.");
//
//
//        thread1.join();
//        thread2.join();
//
//        System.out.println("Final Count (without synchronization): " + counter.getCount());
//
//
//    }
//    public static Runnable threadTask(Counter counter){
//
//        return ()-> {
//            for (int i = 0; i < 20000; i++) {
//                counter.increment();
//            }
//        };
//
//    }
//}
//class Counter{
//    private int count=0;
//    public void increment(){
//        count++;
//    }
//    public int getCount(){
//        return count;
//    }
//}

/**
 *With Synchronization=>synchronized this is used so that until thread completes that task it will not leave or allow
 *  any other thread to perform operation the same item.
 */
public class ThreadingInDS {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedCounter counter = new SynchronizedCounter();
        Runnable task=threadTask(counter);
        Thread thread1=new Thread(task);
        Thread thread2=new Thread(task);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Final Count (with synchronization): " + counter.getCount());

    }
    public static Runnable threadTask(SynchronizedCounter counter){
        return ()->{
            for(int i=0;i<20000;i++){
                counter.increment();
            }
        };
    }
}

class SynchronizedCounter{
    private int count=0;
    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}