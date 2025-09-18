package JavaConcurrencyMultithreading;

public class Synchronization {
    public static void main(String[] args) {
        SharedSynchronized shared=new SharedSynchronized();
        Runnable task=()->{
            for(int i=0;i<3;i++){
                shared.print("Hello "+i);
            }
        };
        //new Thread(Runnable task need to pass, thread name(optional))
        //you directly have new Thread(()->{logic}); but we need to use that same logic so instead of redundant coding we created runnable separately
        new Thread(task,"T1").start();
        new Thread(task,"T2").start();
    }
}
class SharedSynchronized{
    public synchronized void print(String msg){
        System.out.println(Thread.currentThread().getName()+" -> "+ msg);
        try {
            Thread.sleep(500);
        }catch (InterruptedException ignored){

        }
    }
}
