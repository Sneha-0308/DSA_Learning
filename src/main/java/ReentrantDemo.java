import java.util.concurrent.locks.ReentrantLock;

public class ReentrantDemo {
    public static void main(String[] args) {
        SharedReentrant shared =new SharedReentrant();
        Runnable task=()->{
            for(int i=0;i<3;i++){
                shared.print("hello "+i);
            }
        };
        new Thread(task,"T1").start();
        new Thread(task,"T2").start();

    }
}
class SharedReentrant{
    private final ReentrantLock lock=new ReentrantLock();
    public void print(String msg){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" -> "+msg);
            Thread.sleep(500);
        }catch (InterruptedException ignored){}
        finally {
            lock.unlock();
        }
    }
}
